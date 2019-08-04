package com.agsft.util;

import org.springframework.stereotype.Component;

@Component
public class Response {

	private Boolean statusCode;
	private Integer httpStatus;
	private String message;
	private Object body;

	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(Boolean statusCode, Integer httpStatus, String message, Object body) {
		super();
		this.statusCode = statusCode;
		this.httpStatus = httpStatus;
		this.message = message;
		this.body = body;
	}

	public Boolean getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Boolean statusCode) {
		this.statusCode = statusCode;
	}

	public Integer getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((httpStatus == null) ? 0 : httpStatus.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (httpStatus == null) {
			if (other.httpStatus != null)
				return false;
		} else if (!httpStatus.equals(other.httpStatus))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", httpStatus=" + httpStatus + ", message=" + message + ", body="
				+ body + "]";
	}

}
