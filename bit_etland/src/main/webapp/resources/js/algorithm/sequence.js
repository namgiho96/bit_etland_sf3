function sequence(){
	
	_sequence.nav();
	_sequence.drop();
		$('#right_content').prepend($$.div({id:"right_start"}));
		$('#leave_a_comment').before('<div id="right_end" />');
		$('#right_start').nextUntil('#right_end')
			.wrapAll('<div id="new_div"></div>');
		let str = $('#new_div').html();
		$('#new_div').remove();
		$('#right_end').remove();
		
		let arr = [
			{id:'ari', val:'등차수열의 합계'},
			{id:'geo', val:'등비수열'},
			{id:'fac', val:'팩토리얼수열'},
			{id:'fibo', val:'피보나치수열'},
			{id:'switch',val:'교행 자연수 수열'}
		];
		
		$.each(arr,(i,j)=>{
			/*$('#right_start').append(str);*/
			let GID = Math.floor(Math.random() * 10000) + 1;
			let _GID = '#'+GID;
			$('<div id="'+GID+'">'+str+'</div>')
				.appendTo('#right_start');
			let POST = GID+'_POST';
			let _POST = '#'+POST;
			$(_GID+' h4').attr('id',POST);
			
			let TITLE = GID+'_TITLE';
			let _TITLE = '#'+TITLE;
			$(_GID+' h2').attr('id',TITLE);
			
			let DATE = GID+'_DATE';
			let _DATE = '#'+DATE;
			$(_TITLE).siblings('h5').eq(0).attr('id',DATE);
			
			let BTN = GID+'_BTN';
			let _BTN = '#'+BTN;
			$(_TITLE).siblings('h5').eq(1).attr('id',BTN);
			
			let INPUT = GID+'_INPUT';
			let _INPUT = '#'+INPUT;
			
			$(_GID+' p').attr('id',INPUT);
			$(_TITLE).text(j.val);
			$(_BTN).empty();
			$(_INPUT).empty();
			let x=[];
			
			switch(arr,j.id) {
			case 'ari': 
				x = [{cls : 'start', txt: '시작값'},
					{cls : 'end', txt: '한계값'},
					{cls : 'diff', txt: '공차'}];
				break;
			case 'geo': 
				x = [{cls : 'start', txt: '시작값'},
					{cls : 'end', txt: '한계값'},
					{cls : 'end', txt: '한계값'},
					{cls : 'diff', txt: '하하'}];
				break;
			case 'fac': 
				x = [{cls : 'start', txt: '시작값'},
					{cls : 'end', txt: '한계값'},
					{cls : 'diff', txt: '호호'}];
				break;
			case 'fibo':
				x = [{cls : 'start', txt: '시작값'},
					{cls : 'end', txt: '한계값'},
					{cls : 'diff', txt: '히히'}];
				break;
			case 'switch':
				x = [{cls : 'start', txt: '시작값'},
					{cls : 'end', txt: '한계값'},
					{cls : 'diff', txt: '헤헤'}];
				break;
			}
			
			$(_sequence.input_1(x)).appendTo(_INPUT);
			$('#del_start').remove();
			$('#del_end').remove();
			$('<span class="label label-danger"></span>')
			.text('결과')
			.addClass('cursor')
			.attr('name',j.id)
			.appendTo(_BTN)
			.click(function(){
				let that = $(this).attr('name');
				let data = {start: $('.start').val(),
							end : $('.end').val(),
							diff : $('.diff').val()};
					alert('넘어가는 시작값 :'+data.start)
					$.ajax({
						url : $.ctx()+'/algo/seq/'+that,
						type : 'post',
						data : JSON.stringify(data),
						datatype: 'json',
						contentType : "application/json",
						success : d=>{
							$(_INPUT).empty();
							$('<h2>결과값 : '+d.result+'</h2>')
							.appendTo(_INPUT);
						},
						error : e=>{
								alert('AJAX 실패');
						}
						
					});//$.ajax
					
			});//결과 보기 버튼
			$('<span class="label label-warning" style="margin-left: 20px"></spen>')
			.text('리셋')
			.addClass('cursor')
			.appendTo(_BTN)
			.click(()=>{
				$(_INPUT).empty();
				$(_sequence.input_1(x))
					.appendTo(_INPUT);
			});// span
			
		}); //$.each
	}//sequence
var _sequence = {
		 input_1 :(x)=>{
			 	let html = '<form>';
			 	$.each(x,(i,j)=>{
			 		html += '<div class="fomr-group">';
			 		html += '<label for="">'+j.txt+' :</label>';
			 		html += '<input type="text" class="'+j.cls+'"></div>';
			 	});
			 	html += '</form>';
			 	return html;
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