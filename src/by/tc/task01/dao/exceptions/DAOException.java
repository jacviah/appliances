package by.tc.task01.dao.exceptions;

import java.io.Serializable;

public class DAOException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    public  DAOException() {
    }

    public  DAOException(String message) {
        super(message);
    }

    public  DAOException(Throwable cause) {
        super(cause);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}