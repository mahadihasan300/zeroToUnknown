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
//import com.google.gwt.dev.util.Empty;
//import com.google.gwt.dom.client.Style;
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
//    //private DateField date = new DateField("Date :");
//
//
//    private ComboBox cmbFundOrganization=new ComboBox("Fund Organization :");
//
//
//
//
//    private TextField customerId=new TextField();
//    private TextField customerName=new TextField();
//
//
//    private NativeButton btnNew = new NativeButton("New");
//
//    private NativeButton btnSave = new NativeButton("Save");
//
//    //private NativeButton btnExit = new NativeButton("Exit");
//    private SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
//    SimpleDateFormat sdfy = new SimpleDateFormat("yyyy-MM-dd");
//    SimpleDateFormat yrFormat = new SimpleDateFormat("yyyy");
//
//    private boolean isUpdate = false;
//    private boolean isFind = false;
//
//    private String cw = "260px";
//    private String lcw = "120px";
//
//    String db;
//    private String branchOp;
//    private String lw = "100px";
//    private String rw = "100px";
//
//    private String sql = "";
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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
//        Label gap = new Label();
//        gap.setWidth("50px");
//        searchL.addComponent(gap);
//        mainLayout.addComponent(searchL);
//
//        mainLayout.addComponent(formGrid);
//        mainLayout.setComponentAlignment(formGrid, Alignment.TOP_CENTER);
//        formGrid.addComponent(formLayout);
//
//
//        mainLayout.setSpacing(true);
//        if (sessionBean.getSourceOfFund() == 1) {
//
//            formLayout.addComponent(cmbFundOrganization);
//            cmbFundOrganization.setNullSelectionAllowed(false);
//            cmbFundOrganization.setImmediate(true);
//            cmbFundOrganization.setWidth(cw);
//            //categoryInit();
//        }
//        else
//        {
//            System.out.println("Branch init");
//
//        }
//
//
//        hL1.addComponent(leftFormLayout);
//        Label sp1 = new Label();
//        hL1.addComponent(sp1);
//        sp1.setWidth("35px");
//        hL1.addComponent(rightFormLayout);
//        hL1.setSpacing(true);
//
//
//        Label fullLabel=new Label();
//        fullLabel.setCaption("Full-Time");
//
//
//
//        labelL.addComponent(fullLabel);
//        leftFormLayout.addComponent(labelL);
//        leftFormLayout.setComponentAlignment(labelL, Alignment.TOP_CENTER);
//        leftFormLayout.addComponent(customerId);
//        customerId.setWidth(lw);
//
//        leftFormLayout.addComponent(customerName);
//        customerName.setWidth(lw);
//
//
//        rightFormLayout.addComponent(labelR);
//        rightFormLayout.setComponentAlignment(labelR, Alignment.TOP_CENTER);
//
//
//        customerId.setCaption("Customer Id :");
//        customerName.setCaption("Name :");
//
//
//        mainLayout.addComponent(hL1);
//
//        mainLayout.addComponent(btnL);
//        btnL.addComponent(btnNew);
//        btnL.setSpacing(true);
//
//        btnL.addComponent(btnSave);
//
//        //btnL.addComponent(btnExit);
//
//
//        mainLayout.addComponent(btnL);
//        mainLayout.setComponentAlignment(btnL, Alignment.MIDDLE_CENTER);
//        this.addComponent(mainLayout);
//        mainLayout.setMargin(true);
//
//
//        setButtonAction();
//        initialise(false);
//        btnInitialise(true);
//        //    fundInit();
////		branchInit();
//        btnNew.focus();
//
//
//    }
//
//
//
//    private void categoryInit(){
//
//        //	int fundOid=Integer.parseInt(cmbFundOrganization.getValue().toString());
//        //comboInitialize(cmbProduct,"SELECT oid,CONCAT(itemCode,' ',categoryName)loanName FROM `LoanCategory` ");
//        String catSql="SELECT oid,CONCAT(itemCode,' ',categoryName)loanName FROM `LoanCategory` WHERE fundOid='"+cmbFundOrganization.getValue()+"' ";
//
//        System.out.println("catSql="+catSql);
//
//    }
//    private void employmentTypeInit(ComboBox cmb){
//        cmb.addItem(2);
//        cmb.setItemCaption(2, "Self-Employment/Family Employment");
//        cmb.addItem(3);
//        cmb.setItemCaption(3, "Wages-Based Employment");
//
//    }
//    private void dtFieldInitialize(RangeDateField df) {
//        df.setStyleName("datef");
//        df.setDateFormat("dd-MM-yy");
//        df.setImmediate(true);
//        df.setInvalidAllowed(false);
//        df.setResolution(PopupDateField.RESOLUTION_DAY);
//        df.setValue(sessionBean.getOperationDate());
//        df.setValidToDate(sessionBean.getOperationDate());
//
//    }
//    private void comboInitialize(ComboBox combo,String sql) {
//        Session session = null;
//        try {
//            session = SessionFactoryUtil.getInstance(db).openSession();
//            combo.removeAllItems();
//            combo.setNullSelectionAllowed(false);
//
//
//            Iterator iter = session.createSQLQuery(sql).list().iterator();
//            while(iter.hasNext()) {
//                Object[] element = (Object[]) iter.next();
//                combo.addItem(element[0]+"");
//                combo.setItemCaption(element[0]+"", element[1]+"");
//            }
//        } catch (Exception exp) {
//            this.getParent().showNotification("",
//                    "Exception occurred in b.info.1",Notification.TYPE_ERROR_MESSAGE);
//            new ErrorHandler(sessionBean,exp);
//        } finally {
//            try {
//                if(session.isOpen()) {
//                    session.close();
//                }
//            } catch (Exception exp) {
//                this.getParent().showNotification("",
//                        "Exception occurred in b.info.2",Notification.TYPE_ERROR_MESSAGE);
//                new ErrorHandler(sessionBean,exp);
//            }
//        }
//    }
//    private void setButtonAction() {
//
//        btnNew.addListener(new ClickListener() {
//            private static final long serialVersionUID = -7214696764947549492L;
//
//            public void buttonClick(ClickEvent event) {
//                newBtnAction(event);
//            }
//        });
//
//
//        btnSave.addListener(new ClickListener() {
//            private static final long serialVersionUID = -5788504306151863262L;
//
//            public void buttonClick(ClickEvent event) {
//                saveBtnAction(event);
//            }
//        });
//
//
//    }
//
//    private void reloadBtnAction(ClickEvent e) {
//
//        initialise(false);
//        //cmbShastiNo.removeAllItems();
//        txtClear();
//        //cmbShastiNo.removeAllItems();
//        btnInitialise(true);
//
//    }
//    private void fundInit() {
//
//        Session session = null;
//        String sql = "";
//        // previous sql="SELECT oid fundOid,fundName FROM SourceOfFund WHERE oid <> '0'  ORDER BY oid ";
//        sql="SELECT sf.oid fundOid,fundName FROM SourceOfFund sf INNER JOIN LoanCategory lcat ON sf.oid=lcat.fundOid WHERE sf.oid <> '0'  ORDER BY sf.oid ";
//
//        try {
//            cmbFundOrganization.removeAllItems();
//            session = SessionFactoryUtil.getInstance(db).openSession();
//            Iterator iter = session.createSQLQuery(sql).list().iterator();
//            while (iter.hasNext()) {
//                Object[] element = (Object[]) iter.next();
//                cmbFundOrganization.addItem(element[0]);
//                cmbFundOrganization.setItemCaption(element[0],element[0]+"  ["+element[1]+"]");
//
//            }
//
//        } catch (Exception exp) {
//            sessionBean.getRootWindow().showNotification("",
//                    "Exception occurred.",Notification.TYPE_ERROR_MESSAGE);
//            new ErrorHandler(sessionBean,exp);
//        } finally {
//            try {
//                if (session.isOpen()) {
//                    session.close();
//                }
//            } catch (Exception exp) {
//                sessionBean.getRootWindow().showNotification("",
//                        "Exception occurred.",Notification.TYPE_ERROR_MESSAGE);
//                new ErrorHandler(sessionBean,exp);
//            }
//        }
//    }
//
//
//
//    private void saveBtnAction(ClickEvent e) {
//
//
//        if(cmbFundOrganization.getValue()==null && sessionBean.getSourceOfFund() == 1){
//            getWindow().getParent().showNotification(new MyNotification("", "Select Fund Name",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            cmbFundOrganization.focus();
//        }
//        else if(customerId.getValue()=="" && customerName.getValue()=="")
//        {
//            getWindow().getParent().showNotification(new MyNotification("", "Enter Number of Employment",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            customerId.focus();
//        }
//        else{
//
//            new YesNoMessage(this.getParent().getWindow(), "",
//                    "Do you want to insert information?")
//                    .show(new MessageBox.EventListener() {
//                        private static final long serialVersionUID = 5193197941058387805L;
//
//                        public void buttonClicked(ButtonType buttonType) {
//                            if (buttonType.toString().equalsIgnoreCase("YES"))
//                            {
//                                insertData();
//                            }
//                        }
//                    });
//
//
//        }
//    }
//
//
//
//    private void insertData() {
//        System.out.println("Inside inserdata");
//        if (sessionBean.isSubmitable()) {
//
//            Transaction tx = null;
//            Session session = null;
//
//            try {
//                System.out.println("--- insert data");
//                session = SessionFactoryUtil.getInstance(db).openSession();
//                tx = session.beginTransaction();
//
//
//                if(customerId.getValue() != null || customerName.getValue() != null)
//                {
//
//                    String id = session.createSQLQuery("SELECT IFNULL(MAX(oid),0)+1 as id FROM PomisEmploymentInfo")
//                            .list().iterator().next().toString();
//                    Date d=new Date();
//
//                    String createDate=dateFormatter.format(d);
//                    String insertSql="";
//
//                    insertSql = "INSERT INTO `CustomerDemo` " +
//                            "(CustomerId,NAME)" +
//                            "VALUES (" + " ' " + customerId.getValue() + "' , '" +  customerName.getValue()+"' )";
//
//                    session.createSQLQuery(insertSql).executeUpdate();
//
//
//                }
//                this.getParent().showNotification("Information insert successfully.");
//                tx.commit();
//                initialise(false);
//                btnInitialise(true);
//                txtClear();
//                btnNew.focus();
//
//            } catch (Exception exp) {
//                tx.rollback();
//                this.getParent().showNotification("", "Exception occurred.",
//                        Notification.TYPE_ERROR_MESSAGE);
//                exp.printStackTrace();
//                new ErrorHandler(sessionBean, exp);
//            } finally {
//                if (session.isOpen()) {
//                    session.close();
//                }
//            }
//
//
//        } else {
//            this.getParent().showNotification("Authentication Failed",
//                    "You have not proper authentication for save.",
//                    Notification.TYPE_ERROR_MESSAGE);
//        }
//
//    }
//
//    private void newBtnAction(ClickEvent e) {
//
//        isFind=false;
//        txtClear();
//
//        initialise(true);
//        btnInitialise(false);
//        isUpdate = false;
//
//    }
//    private void initialise(boolean t) {
//        cmbFundOrganization.setEnabled(t);
//
//
//        customerId.setEnabled(t);
//        customerName.setEnabled(t);
//
//        labelL.setEnabled(t);
//        labelR.setEnabled(t);
//
//
//    }
//    private void btnInitialise(boolean t) {
//        btnNew.setEnabled(t);
//
//        btnSave.setEnabled(!t);
//
//    }
//
//    private void txtClear() {
//        cmbFundOrganization.setValue(null);
//
//        customerId.setValue("");
//        customerName.setValue("");
//
//
//    }
//
//
//}
