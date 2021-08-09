package me.java.golf.study.step4.dashboard;

import me.java.golf.study.step4.dashboard.domain.Dashboard;
import me.java.golf.study.step4.dashboard.domain.ParticipationStatus;
import me.java.golf.study.step4.dashboard.view.ParticipantionResultView;

import java.io.IOException;

/**
 *  code by. Catsbi
 *  https://github.com/catsbi/java-study/tree/master/src/main/java/me/catsbi/study/step4/dashboard
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Dashboard dashboard = new Dashboard();
        ParticipantionResultView resultView = new ParticipantionResultView();

        ParticipationStatus participationStatus = dashboard.getParticipants();
        resultView.drawParticipationStatusAll(participationStatus);
    }
}
