package a_java_theory.f_transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

// Аннотация @Transactional в Spring используется для декларативного управления транзакциями.
// Она позволяет разработчикам указать, что метод или класс должен выполняться в пределах транзакции, без необходимости вручную писать код для управления транзакциями.


// Основные возможности @Transactional:
//  1.Декларативное управление транзакциями:
//      Аннотация позволяет разработчикам указать, что метод или все методы в классе должны выполняться в транзакции.
//  2.Настройка уровня изоляции:
//      Уровень изоляции определяет, как видимые изменения в транзакции изолируются от других транзакций.
//  3.Настройка распространения транзакций:
//      Поведение аннотированного метода в отношении существующих транзакций.
//  4.Настройка времени ожидания:
//      Установка максимального времени выполнения транзакции.
//  5.Откат по исключению:
//      Указание, при каких исключениях транзакция должна быть откатана.


@Service
public class TransactionalExample {

    @Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRED)
    public void performAdvancedOperation() {
        // код, который должен выполняться в транзакции с заданным уровнем изоляции и распространения
    }
    @Transactional(timeout = 30) // Транзакция будет откатана, если не завершится за 30 секунд
    public void performOperationWithTimeout() {
        // код транзакции
    }

    @Transactional(rollbackFor = Exception.class)
    public void performOperation() {
        // код, который будет откатан при возникновении любого исключения
    }

    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public void performOperationWithoutRollback() {
        // код, который не будет откатан при IllegalArgumentException
    }

}
