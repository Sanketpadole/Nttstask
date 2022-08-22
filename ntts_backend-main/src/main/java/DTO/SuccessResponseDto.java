package DTO;

public class SuccessResponseDto {

	private String message;
    private String msgkey;
	private Object Data;

	
	
public SuccessResponseDto() {
		super();
		
	}


public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


public String getMsgkey() {
	return msgkey;
}


public void setMsgkey(String msgkey) {
	this.msgkey = msgkey;
}


public Object getData() {
	return Data;
}


public SuccessResponseDto(String message, String msgkey, Object data) {
	super();
	this.message = message;
	this.msgkey = msgkey;
	Data = data;
}




	public void setData(Object data) {
		Data = data;
	}



}


