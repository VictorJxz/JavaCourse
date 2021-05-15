package org.svrlab.repository_poo.repository.exeception;

public class DuplicateRecordAccessDataException extends WritingAccessDataException{

    public DuplicateRecordAccessDataException(String message) {
        super(message);
    }
}
