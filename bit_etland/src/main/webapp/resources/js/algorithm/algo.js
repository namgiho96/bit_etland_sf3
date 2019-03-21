var algo = algo||{};
algo =(()=>{
		let init=x=>{
			algo.$.init(x);
		};
		let onCreate=()=>{
			setContentView();
		};
		let setContentView=()=>{
			$.when(
					$.getScript($.js()+'/component/compo.js'),
					$.getScript($.js()+'/algorithm/sequence.js')
				).done(()=>{
					sequence();
					}	//콜백 끝
				);
		};
		return{init:init,onCreate:onCreate};
})();

algo.$ ={
	init : (x)=>{
		$.getScript(x+'/resources/js/router.js',()=>{
			$.extend(new Session(x));
			algo.onCreate();
		})
	}
};


	

