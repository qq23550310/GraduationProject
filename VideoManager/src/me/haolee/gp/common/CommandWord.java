package me.haolee.gp.common;

public enum CommandWord {
	//请求命令字
	REQUEST_CATEGORYLIST,
	REQUEST_TOTALNUMBER,
	REQUEST_VIDEOLIST,
	REQUEST_STREAMINGMEDIA,
	
	//应答命令字
	RESPONSE_DATA,
	RESPONSE_ABORT,
	RESPONSE_CONTINUE,

	//控制命令字
	CTRL_END,
	CTRL_HARTBEAT,
	
	//播放模式命令字
	MODE_LIVE,
	MODE_VOD
}
