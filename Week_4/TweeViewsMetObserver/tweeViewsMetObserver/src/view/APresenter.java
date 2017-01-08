package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.AModel;
import model.BModel;

public class APresenter {
    private AModel aModel;
    private BModel bModel;
    private AView aView;

    public APresenter(AModel aModel, BModel bModel, AView aView) {
        this.aModel = aModel;
        this.bModel = bModel;
        this.aView = aView;
        addEventHandlers();
    }

    private void addEventHandlers() {
        aView.getBtnBereken().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int invoer = Integer.parseInt(aView.getTfInput().getText());
                aModel.setA(invoer);
            }
        });
    }
}
