package com.meowlena.collector;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class CollectionController {

    @FXML
    private ImageView backButton;

    @FXML
    private ImageView searchButton;

    @FXML
    protected void onBackButtonHoverStart() {

        backButton.setScaleX(0.9f);
        backButton.setScaleY(0.9f);
    }

    @FXML
    protected void onBackButtonHoverEnd() {

        backButton.setScaleX(0.7f);
        backButton.setScaleY(0.7f);
    }

    @FXML
    protected void onSearchButtonHoverStart() {

        searchButton.setScaleX(0.9f);
        searchButton.setScaleY(0.9f);
    }

    @FXML
    protected void onSearchButtonHoverEnd() {

        searchButton.setScaleX(0.7f);
        searchButton.setScaleY(0.7f);
    }

}
