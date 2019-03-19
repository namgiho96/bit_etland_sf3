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
				/*$('body').html($$.div({id: 'test',clazz:'clazz'}))*/
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
				$('#que_1').text('수열 1: 등차수열의 합계');
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
					
					$('#que_2').text('수열 2: 등비수열의 합계');
					input_2();
				
					
				
				
				
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
		let input_2 =()=>{
			$('#result_2').html($$.input({type:'text',id:'start'}));
			$('#result_2').prepend('시작값 : ');
			$('#result_2').append('<br/> <br/> 한계값 : ');
			$('#result_2').append($$.input({type:'text',id:'end'}));
			$('#result_2').append('<br/> <br/> 공비 : ');
			$('#result_2').append($$.input({type:'text',id:'diff'}));
			
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


	

