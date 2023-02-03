package org.camunda.bpm.getstarted.loanapproval.task;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ClientCheck implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Thread.sleep(10000);
        var iId = execution.getActivityInstanceId();
        var variables = execution.getVariables();
        boolean jobExecutorActivate = execution.getProcessEngine().getProcessEngineConfiguration().isJobExecutorActivate();
        System.out.println();
    }
}
