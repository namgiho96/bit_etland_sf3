function sequence(){
	_sequence.nav();
	_sequence.drop();
	_sequence.question('등차수열의 합계');
		$('#right_content').prepend($$.div({id:"right_start"}));
		$('#leave_a_comment').before('<div id="right_end" />');
		$('#right_start').nextUntil('#right_end')
			.wrapAll('<div id="new_div"></div>');
		let str = $('#new_div').html();
			$('#new_div').remove();
			$('#right_end').remove();
		let arr = [
			{id:'a', val:'등차수열의 합계'},
			{id:'b', val:'등비수열'},
			{id:'c', val:'팩토리얼수열'},
			{id:'d', val:'피보나치수열'}
		];
		$.each(arr,(i,j)=>{
			/*$('#right_start').append(str);*/
			$(str).appendTo('#right_start')
			$('#question').attr('id','question_'+j.id);
			$('#question_'+j.id).text(j.val);
			$('.buttons').empty();
			$('<span class="label label-danger"></span>')
			.text('결과')
			.addClass('cursor')
			.appendTo('.buttons')
			.click(()=>{
				let data = {start: $('#start').val(),
							end : $('#end').val(),
							diff : $('#diff').val()};
					alert('일단 결과 클릭됨'+$('#start').val());
					$.ajax({
						url : $.ctx()+'/algo/seq/1',
						type : 'post',
						data : JSON.stringify(data),
						datatype: 'json',
						contentType : "application/json",
						success : d=>{
							alert('넘어온 문제번호 :'+d.result);
							$('#result').html($$.h({id:'h_res',size:'2'})
								.text('결과값  : '+d.result));
							$('#form').remove();
						},
						error : e=>{
								alert('AJAX 실패');
						}
						
					});//$.ajax
					
			});//결과 보기 버튼
			$('<span class="label label-warning" style="margin-left: 20px"></spen>')
			.text('리셋')
			.addClass('cursor')
			.appendTo('.buttons')
			.click(()=>{
				$('#form').remove();
				_sequence.input_1();
			});// span
			
		}); //$.each
	}//sequence
var _sequence = {
		 input_1 :()=>{
			 	$('p#result').html($$.form({id:'form'}));
				$('form#form').html($$.div({id:'div_1'}).addClass('form-group'));
				$('div#div_1').html($$.label({name:'lab_1'}).text('시작값 :'))
							.append($$.input({type:'text', id:'start'}));
				$('form#form').append($$.div({id:'div_2'}).addClass('form-group'));
				$('div#div_2').html($$.label({name:'lab_2'}).text('한계값 :'))
							.append($$.input({type:'text', id:'end'}));
				$('form#form').append($$.div({id:'div_3'}).addClass('form-group'));
				$('div#div_3').html($$.label({name:'lab_3'}).text('공차 :'))
							.append($$.input({type:'text', id:'diff'}));
			 
			/*$('#result_1').html($$.input({type:'text',id:'start'}));
			$('#result_1').prepend('시작값 : ');
			$('#result_1').append('<br/> <br/> 한계값 : ');
			$('#result_1').append($$.input({type:'text',id:'end'}));
			$('#result_1').append('<br/> <br/> 공차 : ');
			$('#result_1').append($$.input({type:'text',id:'diff'}));*/
		},
		 question:(x)=>{
			$('#question').text(x);
			_sequence.input_1();
			//ajax
			$('#reset_btn').text('리셋').addClass('cursor')
				.click(()=>{
					_sequence.input_1();
				});
		},
		 nav :()=>{
			$('#nav').children().eq(0)
			.html($$.a({id:'seq', url:'#'}).text('수열'))
			$('#nav').children().eq(1)
					.html($$.a({id:'math',url:'#'}).text('수학'))
			$('#nav').children().eq(2)
					.html($$.a({id:'arr',url:'#'}).text('배열'))
			$('#nav').children().eq(3)
					.html($$.a({id:'coll',url:'#'}).text('자료구조'))
			$('#nav').append($$.li({id:''}))
					.children().eq(4).html($$.a({id:'app',}).text('응용'));
		},
		 drop :()=>{
			$('#rm_start').before('<div id="del_start"/>')
			$('#rm_end').after('<div id="del_end">')
			$('#del_start').nextUntil('#del_end')
				.wrap().remove();
		}
			
};