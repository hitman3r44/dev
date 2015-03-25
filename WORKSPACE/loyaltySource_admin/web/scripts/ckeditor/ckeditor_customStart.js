
function initRichEditorWhenReady() {
	var ckToolbar = [
	     ['Bold','Italic','Underline','-','NumberedList','BulletedList','-','JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock','-','Undo','Redo','-','Format','Font','Scayt'],
	     [],
	     []
	];
	$(".ckeditor.ckEN").ckeditor($.noop, {
		width: '600px',
		height: '150px',
		toolbar: ckToolbar,
		scayt_autoStartup: true,
		scayt_sLang: 'en_US'
	});
	$(".ckeditor.ckFR").ckeditor($.noop, {
		width: '600px',
		height: '150px',
		toolbar: ckToolbar,
		scayt_autoStartup: true,
		scayt_sLang: 'fr_FR'
	});
	// fix for a spacing problem
	$(".ckeditor").prev("label").css("float","none");
}