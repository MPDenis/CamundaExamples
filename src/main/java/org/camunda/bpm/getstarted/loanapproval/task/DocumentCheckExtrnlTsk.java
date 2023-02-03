//package org.camunda.bpm.getstarted.loanapproval.task;
//
//import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
//import org.camunda.bpm.client.task.ExternalTask;
//import org.camunda.bpm.client.task.ExternalTaskHandler;
//import org.camunda.bpm.client.task.ExternalTaskService;
//import org.camunda.bpm.engine.variable.VariableMap;
//import org.camunda.bpm.engine.variable.Variables;
//import org.springframework.stereotype.Component;
//
//
///**
// * Тестирование внешней задачи. Для нее нужны доп настройки в application.yml
// * Она запрашивается у process engine по REST. !!! На ее запуск нужно несколько секунд ~ 7,
// * но на схеме видно, токен процесса (execution), перемещается мнгновенно и если, дпустим, на на таску навешен
// * TimerBoundaryEvent - отсчет начнется в тот же момент, как токен перешел на значек.
// */
//
//
//@Component
//@ExternalTaskSubscription("scoreProvider")
//public class DocumentCheckExtrnlTsk implements ExternalTaskHandler {
//
//    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        VariableMap variables = Variables.createVariables();
//        variables.put("documentName", "passport");
//
//        // complete the external task
//        externalTaskService.complete(externalTask, variables);
//    }
//}
