var app = app ||{};
app =(()=>{
	var init =x=>{
		app.session.init(x);
		alert(app.$.ctx())
		onCreate();
	}
	var onCreate =()=>{
		setContentView();
	};
	var setContentView=()=>{
		$('#top').empty().text('탑');
		$('#main').empty().text('메인');
		$('#bottom').empty().text('바텀');
		
		$('#top').html('<h1>탑</h1>');
		$('#main').html('<h1>메인</h1>');
		$('#bottom').html('<h1>바텀</h1>');
	};
	return{init:init}
})();

app.session =(()=>{
	var init =x=>{
		onCreate(x);
	}
	var onCreate=x=>{
		sessionStorage.setItem('ctx',x);
		sessionStorage.setItem('js',x+'/resources/js');
		sessionStorage.setItem('img',x+'/resources/img');
		sessionStorage.setItem('css',x+'/resources/css');
	}
	return {init:init}
		
})()

app.$ = (()=>{
	
	return{
		ctx:()=>{return sessionStorage.getItem('ctx');},
		js:()=> {return sessionStorage.getItem('js');},
		img:()=>{return sessionStorage.getItem('img');},
		css:()=>{return sessionStorage.getItem('css');}
	};
})()
























