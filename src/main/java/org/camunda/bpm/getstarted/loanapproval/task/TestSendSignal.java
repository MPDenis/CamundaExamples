package org.camunda.bpm.getstarted.loanapproval.task;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Execution;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TestSendSignal implements JavaDelegate {

    private final RuntimeService runtimeService;

    public TestSendSignal(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        runtimeService.createSignalEvent("StSignal111").send();
        System.out.println("TestSendSignal - send a signal!");

//        List<Execution> executions = runtimeService.createExecutionQuery()
//                .signalEventSubscriptionName("StSignal")
//                .list();
//
//        executions.forEach(System.out::println);
    }
}
