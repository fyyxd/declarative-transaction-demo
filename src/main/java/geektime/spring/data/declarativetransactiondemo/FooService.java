package geektime.spring.data.declarativetransactiondemo;

/**
 * Created by Administrator on 2019/5/1.
 */
public interface FooService {

    void insertRecord();
    void insertThenRollback() throws RollbackException;
    void invokeInsertThenRollback() throws RollbackException;
}
