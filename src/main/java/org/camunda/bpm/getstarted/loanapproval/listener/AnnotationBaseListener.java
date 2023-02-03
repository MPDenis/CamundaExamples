package org.camunda.bpm.getstarted.loanapproval.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBaseListener {

//    @EventListener(condition = "#delegateTask.eventName=='create'")
//    public void userTaskEvent(DelegateTask delegateTask){
//        System.out.println();
//    }

//    @EventListener(condition = "#delegateExecution.eventName=='start'")
//    public void executionEvent(DelegateExecution delegateExecution){
//        System.out.println();
//    }
}
