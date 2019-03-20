var algo = algo||{};
algo =(()=>{
		let init=x=>{
			algo.$.init(x);
		};
		let onCreate=()=>{
			setContentView();
		};
		let setContentView=()=>{
			$.getScript($.js()+'/compo.js',()=>{
				drop();
				nav();
				question('등차수열');
				
				$('#right_content').prepend($$.div({id:"right_start"}));
				$('#leave_a_comment').before('<div id="right_end" />');
				$('#right_start').nextUntil('#right_end')
					.wrapAll('<div id="new_div"></div>');
				var str = $('#new_div').html();
				$('#new_div').remove();
				$('#right_end').remove();
				let arr = [
					{id:'a', val:'등차수열'},
					{id:'b', val:'등비수열'},
					{id:'c', val:'팩토리얼수열'},
					{id:'d', val:'피보나치수열'}
				];
				$.each(arr,(i,j)=>{
					$('#right_start').append(str);
					$('#question').attr('id','question_'+j.id);
					$('#question_'+j.id).text(j.val);
					
				});
			})
		};
		
		let input_1 =()=>{
			$('#result_1').html($$.input({type:'text',id:'start'}));
			$('#result_1').prepend('시작값 : ');
			$('#result_1').append('<br/> <br/> 한계값 : ');
			$('#result_1').append($$.input({type:'text',id:'end'}));
			$('#result_1').append('<br/> <br/> 공차 : ');
			$('#result_1').append($$.input({type:'text',id:'diff'}));
		}
		let question =(x)=>{
			$('#question').text(x);
			input_1();
			$('#answer_btn_1').text('결과').addClass('cursor')
				.click(()=>{
					$.ajax({
							url : $.ctx()+'/algo/seq/1',
							type : 'post',
							data : JSON.stringify({
							start: $('#start').val(),
							end : $('#end').val(),
							diff : $('#diff').val()}),
							datatype: 'json',
							contentType : "application/json",
							success : d=>{
							alert('넘어온 문제번호 :'+d.result);
								$('#result_1').html($$.h({id:'h_res',size:'2'})
									.text('결과값  : '+d.result));
							},
							error : e=>{
							alert('AJAX 실패');
							}
					});
				});	
			$('#answer_btn_2').text('리셋').addClass('cursor')
				.click(()=>{
					input_1();
				})
				
		}
		let nav =()=>{
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
		}
		let drop =()=>{
			$('#rm_start').before('<div id="del_start"/>')
			$('#rm_end').after('<div id="del_end">')
			$('#del_start').nextUntil('#del_end')
				.wrap().remove();
		}
		return{init:init,
			onCreate:onCreate};
})();

algo.$ ={
	init : (x)=>{
		$.getScript(x+'/resources/js/router.js',()=>{
			$.extend(new Session(x));
			algo.onCreate();
		})
	}
};


	

