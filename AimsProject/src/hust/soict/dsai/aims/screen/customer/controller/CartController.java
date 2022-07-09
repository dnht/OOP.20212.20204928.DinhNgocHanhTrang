package hust.soict.dsai.aims.screen.customer.controller;

import java.io.IOException;

import javax.swing.text.TableView;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CartController {

    @FXML
    private TableColumn<?, ?> colMediaId;

    @FXML
    private Label costLabel;

    @FXML
    private TableView tblMedia;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TableColumn<?, ?> colMediaTitle;

    @FXML
    private TableColumn<?, ?> colMediaCategory;
    
    @FXML
    private TableColumn<?, ?> colMediaCost;

    @FXML
    void btnPlayPressed(ActionEvent event) {

    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionMode().getSelectedItem();
    	cart.removeMedia(media);
    }
    
    @FXML
    void btnViewStorePressed(ActionEvent event) {
    	try {
    		final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
    			fxmlLoader.setController(new CartController(store, cart));
    			Parent root = fxmlLoader.load();
    			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    			stage.setScene(new Scene(root));
    			stage.setTitle("Store");
    			stage.show();
    	}catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    private Cart cart;
    private Store store;
    
    public CartController(Cart cart) {
    	this.cart = cart;
    }
    public CartController (Store store, Cart cart) {
    	this.store = store;
    	this.cart = cart;
    }
    
    @FXML
    public void initialize() {
    	colMediaId.setCellValueFactory( new PropertyValueFactory<Media, Integer>("Id"));
    	colMediaTitle.setCellValueFactory( new PropertyValueFactory<Media, String>("Title"));
    	colMediaCategory.setCellValueFactory( new PropertyValueFactory<Media, String>("Category"));
    	colMediaCost.setCellValueFactory( new PropertyValueFactory<Media, Float>("Cost"));
    	if (cart.getItemsOrdered() != null)
    		tblMedia.setItems(cart.getItemsOrdered());
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>(){
    		@Override
    		public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
    			updateButtonBar(newValue);
    		}
    	});
    	
    }
    void updateButtonBar(Media media) {
		if (media == null) {
			btnPlay.setVisible(false);
			btnRemove.setVisible(false);
		}else {
			btnRemove.setVisible(true);
			if (media instanceof Playable) {
				btnPlay.setVisible(true);
			}else {
				btnPlay.setVisible(false);
			}
		}
	}
    

}
