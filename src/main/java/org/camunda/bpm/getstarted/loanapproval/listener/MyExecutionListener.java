package org.camunda.bpm.getstarted.loanapproval.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Слушатель исполнения перехватывает flow (AfterChekingFlow) поток у которго проверяет переменную
 * и в случае , если условие истинно , вводит новую переменную
 */
@Component
public class MyExecutionListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        var sum  = (Long) execution.getVariable("sum");

        if(Objects.nonNull(sum) && sum > 150000){
            execution.setVariable("additionalVerification", true);
        }
    }
}
