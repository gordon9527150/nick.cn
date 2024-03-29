package cn.tedu.blogs.service.ex;
/**
 * 业务异常的基类
 * @author soft01
 *
 */
public class ServiceException extends RuntimeException {

	
	private static final long serialVersionUID = -1370935489920368850L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
	
}
