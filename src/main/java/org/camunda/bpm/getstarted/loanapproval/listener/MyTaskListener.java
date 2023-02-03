package org.camunda.bpm.getstarted.loanapproval.listener;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;


/**
 * Слушатель задачи. Прикреплен к userTask - Согласование, к этапу "Complete"
 * Исплняет доп логику.
 */
@Component
public class MyTaskListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        var taskName = delegateTask.getName();
        var isContainVariableWithName = delegateTask.hasVariable("myVariable");
        var s = delegateTask.getVariables();

        if(taskName.equals("ClientCheck")){
            System.out.println("Мы поймали сервисную таску по имени задачи");
        }

        if(taskName.equals("agreement")){
            System.out.println("Мы поймали сервисную таску по имени задачи");
        }

        if(isContainVariableWithName){
            System.out.println("Мы перехватили по наличию переменной с именем - myVariable");
        }
    }
}
