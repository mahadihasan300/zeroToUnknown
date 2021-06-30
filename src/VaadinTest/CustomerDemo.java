//
//package com.mcc.mfiuser.ui.transaction;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.joda.time.LocalDate;
//
//import org.vaadin.addons.rangedatefield.RangeDateField;
//
//
//import org.vaadin.autoreplacefield.IntegerField;
//import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.ViewerRequest.Initialize;
//import com.google.gwt.dom.client.Style;
//import com.google.gwt.layout.client.Layout;
//import com.mcc.mfiuser.common.ErrorHandler;
//import com.mcc.mfiuser.common.SessionBean;
//import com.mcc.mfiuser.common.SessionFactoryUtil;
//import com.mcc.mfiuser.common.TextRead;
//import com.mcc.mfiuser.common.YesNoMessage;
//import com.mcc.mfiuser.ui.RegistrationForm;
//import com.mcc.mfiuser.ui.common.BranchInitialize;
//import com.mcc.mfiuser.ui.common.MyNotification;
//import com.vaadin.data.Property;
//import com.vaadin.data.Property.ConversionException;
//import com.vaadin.data.Property.ReadOnlyException;
//import com.vaadin.data.Property.ValueChangeEvent;
//import com.vaadin.terminal.gwt.server.WebApplicationContext;
//import com.vaadin.ui.Alignment;
//import com.vaadin.ui.CheckBox;
//import com.vaadin.ui.ComboBox;
//import com.vaadin.ui.DateField;
//import com.vaadin.ui.FormLayout;
//import com.vaadin.ui.GridLayout;
//import com.vaadin.ui.HorizontalLayout;
//import com.vaadin.ui.Label;
//import com.vaadin.ui.NativeButton;
//import com.vaadin.ui.PopupDateField;
//import com.vaadin.ui.TextField;
//import com.vaadin.ui.VerticalLayout;
//import com.vaadin.ui.Window;
//import com.vaadin.ui.AbstractSelect.Filtering;
//import com.vaadin.ui.Button.ClickEvent;
//import com.vaadin.ui.Button.ClickListener;
//import com.vaadin.ui.Window.Notification;
//
//import de.steinwedel.vaadin.MessageBox;
//import de.steinwedel.vaadin.MessageBox.ButtonType;
//
//public class CustomerDemo extends Window {
//    private static final long serialVersionUID = 8098754523462546907L;
//    private SessionBean sessionBean;
//
//    private VerticalLayout mainLayout = new VerticalLayout();
//    private GridLayout formGrid = new GridLayout(1, 1);
//    private FormLayout formLayout = new FormLayout();
//    private HorizontalLayout btnL = new HorizontalLayout();
//    private HorizontalLayout hL1 = new HorizontalLayout();
//    private HorizontalLayout searchL = new HorizontalLayout();
//
//    private FormLayout leftFormLayout = new FormLayout();
//    private FormLayout rightFormLayout = new FormLayout();
//    private HorizontalLayout labelL=new HorizontalLayout();
//    private HorizontalLayout labelR=new HorizontalLayout();
//
//
//
//
//    private TextField customerId=new IntegerField();
//    private TextField name=new TextField();
//
//    private String cw = "260px";
//    private String lcw = "120px";
//    //       Date dw = null;
//    String db;
//    private String branchOp;
//    private String lw = "100px";
//    private String rw = "100px";
//
//    private NativeButton btnSave = new NativeButton("Save");
//
//    private String sql = "";
//
//
//    public CustomerDemo(SessionBean sessionBean, int i) {
//
//        System.out.print("hello");
//
//        this.sessionBean = sessionBean;
//        this.setResizable(false);
//        this.setWidth("450px");
//        this.setCaption("Customer Demo"+this.sessionBean.getProjectName());
//        db = sessionBean.getDb();
//
//
//        mainLayout.addComponent(formGrid);
//        mainLayout.setComponentAlignment(formGrid, Alignment.TOP_CENTER);
//        formGrid.addComponent(formLayout);
//        formLayout.addComponent(customerId);
//
////		mainLayout.addComponent(customerId);
////		customerId.setCaption("Customer Id :");
////
////
////		mainLayout.addComponent(name);
////		name.setCaption("Name :");
//
//        customerId.setWidth(cw);
//
//        this.addComponent(mainLayout);
//
//
//
//
//
//    }
//
//
//
//
//
//}
//
