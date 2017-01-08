package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.AModel;
import model.BModel;

public class BPresenter {
    private AModel aModel;
    private BModel bModel;
    private BView bView;

    public BPresenter(AModel aModel, BModel bModel, BView bView) {
        this.aModel = aModel;
        this.bModel = bModel;
        this.bView = bView;
        addEventHandlers();
    }

    private void addEventHandlers() {
        bView.getBtnBereken().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int invoer = Integer.parseInt(bView.getTfInput().getText());
                bModel.setB(invoer);
            }
        });
    }
}