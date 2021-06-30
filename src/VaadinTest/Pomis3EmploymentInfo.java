//package VaadinTest;
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
//public class Pomis3EmploymentInfo extends Window {
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
//    private RangeDateField date = new RangeDateField("Date :");
//
//    private ComboBox cmbFundOrganization=new ComboBox("Fund Organization :");
//
//    private ComboBox cmbBranch = new ComboBox("Branch :");
//    private ComboBox cmbProduct=new ComboBox("Category :");
//    private ComboBox cmbEmploymentType=new ComboBox("Employment Type :");
//
//    private TextField fullMale=new IntegerField();
//    private TextField fullFemale=new IntegerField();
//    private TextField partMale=new IntegerField();
//    private TextField partFemale=new IntegerField();
//
//    private NativeButton btnNew = new NativeButton("New");
//    private NativeButton btnUpdate = new NativeButton("Update");
//    private NativeButton btnSave = new NativeButton("Save");
//    private NativeButton btnRefresh = new NativeButton("Refresh");
//    private NativeButton btnFind = new NativeButton("Find");
//    //private NativeButton btnExit = new NativeButton("Exit");
//    private SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
//    SimpleDateFormat sdfy = new SimpleDateFormat("yyyy-MM-dd");
//    SimpleDateFormat yrFormat = new SimpleDateFormat("yyyy");
//    private String loanWidAmount1="";
//    private String loanWidAmount2="";
//    private String gsAmount="";
//    private String vsAmount="";
//    private String ltsAmount="";
//    private int loanWithdrawalOid1 ;
//    private int loanWithdrawalOid2 ;
//    private int savingsGSOid ;
//    private int savingsLTSOid;
//    private int savingsVSOid ;
//    private int i;
//    private String cw = "260px";
//    private String lcw = "120px";
//    //       Date dw = null;
//    String db;
//    private String branchOp;
//    private String lw = "100px";
//    private String rw = "100px";
//    //private String loanId1 = "" ;
//    //private String loanId2 = "";
//    //private String savingsVSId = "";
//    //private String savingsLTSId = "";
//    //private String savingsGSId = "";
//    private String sql = "";
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    private boolean isUpdate = false;
//    private boolean isFind = false;
//
//    public Pomis3EmploymentInfo(SessionBean sessionBean, int i) {
//
//        System.out.print("hello");
//
//        this.sessionBean = sessionBean;
//        this.setResizable(false);
//        this.setWidth("450px");
//        this.setCaption("Pomis 3 Employment Info"+this.sessionBean.getProjectName());
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
//            categoryInit();
//        }
//        else
//        {
//            branchInit();
//
//        }
//        formLayout.addComponent(cmbBranch);
//        cmbBranch.setNullSelectionAllowed(false);
//        cmbBranch.setImmediate(true);
//        cmbBranch.setWidth(cw);
//
//        formLayout.addComponent(date);
//        date.setWidth(lcw);
//        date.setValue(sessionBean.getOperationDate());
//        date.setResolution(PopupDateField.RESOLUTION_DAY);
//
//
//        date.setDateFormat("dd-MM-yy");
//        date.setInvalidAllowed(false);
//        date.setImmediate(true);
//
//        formLayout.addComponent(cmbProduct);
//        cmbProduct.setNullSelectionAllowed(false);
//        cmbProduct.setImmediate(true);
//        cmbProduct.setWidth(cw);
//
//        formLayout.addComponent(cmbEmploymentType);
//        cmbEmploymentType.setNullSelectionAllowed(false);
//        cmbEmploymentType.setImmediate(true);
//        cmbEmploymentType.setWidth(cw);
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
//        Label partLabel =new Label();
//        partLabel.setCaption("Part-time");
//
//        labelL.addComponent(fullLabel);
//        leftFormLayout.addComponent(labelL);
//        leftFormLayout.setComponentAlignment(labelL, Alignment.TOP_CENTER);
//        leftFormLayout.addComponent(fullMale);
//        fullMale.setWidth(lw);
//
//        leftFormLayout.addComponent(fullFemale);
//        fullFemale.setWidth(lw);
//
//        labelR.addComponent(partLabel);
//        rightFormLayout.addComponent(labelR);
//        rightFormLayout.setComponentAlignment(labelR, Alignment.TOP_CENTER);
//        rightFormLayout.addComponent(partMale);
//        partMale.setWidth(rw);
//        rightFormLayout.addComponent(partFemale);
//        partFemale.setWidth(rw);
//
//        fullMale.setCaption("Male :");
//        fullFemale.setCaption("Female :");
//        partMale.setCaption("Male :");
//        partFemale.setCaption("Female :");
//
//        mainLayout.addComponent(hL1);
//
//        mainLayout.addComponent(btnL);
//        btnL.addComponent(btnNew);
//        btnL.setSpacing(true);
//        btnL.addComponent(btnUpdate);
//        btnL.addComponent(btnSave);
//        btnL.addComponent(btnRefresh);
//        btnL.addComponent(btnFind);
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
//        fundInit();
////		branchInit();
//        btnNew.focus();
//        dtFieldInitialize(date);
//
//        cmbBranch.setFilteringMode(ComboBox.FILTERINGMODE_CONTAINS);
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
//        comboInitialize(cmbProduct,catSql);
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
//        btnRefresh.addListener(new ClickListener() {
//            private static final long serialVersionUID = -5509721563748009303L;
//
//            public void buttonClick(ClickEvent event) {
//                reloadBtnAction(event);
//            }
//        });
//
//        cmbBranch.addListener(new Property.ValueChangeListener() {
//            private static final long serialVersionUID = -6719935072396418418L;
//            public void valueChange(ValueChangeEvent event) {
//                if (cmbBranch.getValue() != null) {
//                    setOperationDate();
//                    //categoryInit();
//                    if (sessionBean.getSourceOfFund() != 1) {
//                        String catSql="SELECT oid,CONCAT(itemCode,' ',categoryName)loanName FROM `LoanCategory` ";
//                        comboInitialize(cmbProduct,catSql);
//                        System.out.println("catSql44="+catSql);
//                    }
//
//                } else {
//                    cmbProduct.removeAllItems();
//                }
//            }
//        });
//        cmbFundOrganization.addListener(new Property.ValueChangeListener() {
//            private static final long serialVersionUID = -6719935072396418418L;
//            public void valueChange(ValueChangeEvent event) {
//                if (cmbFundOrganization.getValue() != null) {
//                    branchInit();
//                    categoryInit();
//                    System.out.println("inside cmbFundOrganization listener");
//                } else {
//                    cmbBranch.removeAllItems();
//                }
//            }
//        });
//        cmbProduct.addListener(new Property.ValueChangeListener() {
//            private static final long serialVersionUID = -6719935072396418418L;
//            public void valueChange(ValueChangeEvent event) {
//                if (cmbProduct.getValue() != null) {
//                    employmentTypeInit(cmbEmploymentType);
//                } else {
//                    cmbEmploymentType.removeAllItems();
//                }
//            }
//        });
//        btnSave.addListener(new ClickListener() {
//            private static final long serialVersionUID = -5788504306151863262L;
//
//            public void buttonClick(ClickEvent event) {
//                saveBtnAction(event);
//            }
//        });
//
//        btnUpdate.addListener(new ClickListener() {
//            private static final long serialVersionUID = -8728663402091653534L;
//
//            public void buttonClick(ClickEvent event) {
//                //updateBtnAction(event);
//            }
//        });
//
//		/*btnFind.addListener(new ClickListener() {
//			private static final long serialVersionUID = -4499180782405799680L;
//
//			public void buttonClick(ClickEvent event) {
//
//				isFind = true;
//			  	txtClear();
//			  	initialise(false);
//
//			  	asOnDate.setEnabled(true);
//		        cmbBranch.setEnabled(true);
//		        //cmbShastiNo.setEnabled(true);
//				isFind = true;
//			}
//		});*/
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
//    private void branchInit() {
//
//        Session session = null;
//
//        String sql = "";
//        int i = 0;
//        if (sessionBean.getMfiBranchOid().equals("null")) {
//            sql = "SELECT oid,branchCode,branchName FROM MfiBranch WHERE mfiOid = "
//                    + sessionBean.getMfiOid() +" ORDER BY branchCode";
//            i = 0;
//        } else {
//            sql = "SELECT oid,branchCode,branchName FROM MfiBranch WHERE oid = "
//                    + sessionBean.getMfiBranchOid() +" ORDER BY branchCode";
//            i = 1;
//
//        }
//
//        try {
//            cmbBranch.removeAllItems();
//            session = SessionFactoryUtil.getInstance(db).openSession();
//            Iterator iter = session.createSQLQuery(sql).list().iterator();
//            while (iter.hasNext()) {
//                Object[] element = (Object[]) iter.next();
//                cmbBranch.addItem(element[0]+"");
//                cmbBranch.setItemCaption(element[0]+"", element[1]+"  ["+element[2]+"]");
//                if (i == 1) {
//                    cmbBranch.setValue(element[0]+"");
//                    //shastiNoInitialize();
//                }
//            }
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
//
//        //TEST for CATEGORY
//
//
//    }
//
//    private void saveBtnAction(ClickEvent e) {
//        LocalDate a = new LocalDate(dateFormatter.format(date.getValue()));
//        LocalDate b = new LocalDate(branchOp);
//        if(cmbFundOrganization.getValue()==null && sessionBean.getSourceOfFund() == 1){
//            getWindow().getParent().showNotification(new MyNotification("", "Select Fund Name",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            cmbFundOrganization.focus();
//        }
//        else if(cmbBranch.getValue()==null){
//            getWindow().getParent().showNotification(new MyNotification("", "Select Branch Name",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            cmbBranch.focus();
//        }else if(date.getValue()==null){
//            getWindow().getParent().showNotification(new MyNotification("", "Select Date",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            date.focus();
//        }else if(cmbProduct.getValue()==null || cmbProduct.getValue()=="All"){
//            getWindow().getParent().showNotification(new MyNotification("", "Select Product Name",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            cmbProduct.focus();
//        }else if(cmbEmploymentType.getValue()==null){
//            getWindow().getParent().showNotification(new MyNotification("", "Select Employment Type",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            cmbEmploymentType.focus();
//        }else if(fullMale.getValue()==null && fullFemale.getValue()==null
//                && partMale.getValue()==null && partFemale.getValue()==null){
//            getWindow().getParent().showNotification(new MyNotification("", "Enter Number of Employment",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            fullMale.focus();
//        }else if(a.isAfter(b)){
//            getWindow().getParent().showNotification(new MyNotification("", "Date can not be Greater than Operation Date",
//                    Notification.TYPE_TRAY_NOTIFICATION));
//            date.focus();
//        }
//        else{
//            if(isValidInsert()){
//
//
//
//                new YesNoMessage(this.getParent().getWindow(), "",
//                        "Do you want to insert information?")
//                        .show(new MessageBox.EventListener() {
//                            private static final long serialVersionUID = 5193197941058387805L;
//
//                            public void buttonClicked(ButtonType buttonType) {
//                                if (buttonType.toString().equalsIgnoreCase("YES"))
//                                {
//                                    insertData();
//                                }
//                            }
//                        });
//
//
//                //	insertData();
//            }
//        }
//    }
//
//    private boolean isValidInsert() {
//        if (cmbBranch.getValue().toString().trim().length() == 0) {
//            cmbBranch.focus();
//            this.getParent().showNotification("", "Please select Branch Name.",
//                    Notification.TYPE_WARNING_MESSAGE);
//            return false;
//        }  else {
//            return true;
//        }
//    }
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
//                System.out.println("employ type="+cmbEmploymentType.getValue());
//
//
//                // loan 1
//                //if(!txtLoan1Amount.getValue().equals(""))
//                //if(txtLoan1Amount.getValue().toString().trim().length() != 0)
//                if(fullMale.getValue() != null || fullFemale.getValue() != null ||
//                        partMale.getValue() !=null || partFemale.getValue()!=null)
//                {
//
//                    String id = session.createSQLQuery("SELECT IFNULL(MAX(oid),0)+1 as id FROM PomisEmploymentInfo")
//                            .list().iterator().next().toString();
//                    Date d=new Date();
//                    //			 RangeDateField d=new RangeDateField();
//                    //	 DateField d=new DateField();
//                    String createDate=dateFormatter.format(d);
//                    String insertSql="";
//                    if(cmbEmploymentType.getValue().toString().equals("2"))
//                    {
//                        insertSql="INSERT INTO `PomisEmploymentInfo` " +
//                                "(oid,fundOid,branchOid,createDate,opDate,loanCategory,ftMaleSE,ftFemaleSE,ptMaleSE,ptFemaleSE)"+
//                                " VALUES ("+id+","+
//                                cmbFundOrganization.getValue()+" , "+
//                                cmbBranch.getValue()+", '"+
//                                createDate+"' , '"+
//                                dateFormatter.format(date.getValue())+"' ,"+
//                                cmbProduct.getValue()+","+
//                                fullMale.getValue()+","+
//                                fullFemale.getValue()+","+
//                                partMale.getValue()+","+
//                                partFemale.getValue()+")";
//                    }
//
//                    else
//                    {
//                        insertSql="INSERT INTO `PomisEmploymentInfo` " +
//                                "(oid,fundOid,branchOid,createDate,opDate,loanCategory,ftMaleWB,ftFemaleWB,ptMaleWB,ptFemaleWB)"+
//                                " VALUES ("+id+","+
//                                cmbFundOrganization.getValue()+" , "+
//                                cmbBranch.getValue()+", '"+
//                                createDate+"' , '"+
//                                dateFormatter.format(date.getValue())+"' ,"+
//                                cmbProduct.getValue()+","+
//                                fullMale.getValue()+","+
//                                fullFemale.getValue()+","+
//                                partMale.getValue()+","+
//                                partFemale.getValue()+")";
//                    }
//
//
//
//                    session.createSQLQuery(insertSql).executeUpdate();
//
//
///*				String id = session.createSQLQuery("SELECT IFNULL(MAX(oid),0)+1 as id FROM PomisEmploymentInfo")
//				.list().iterator().next().toString();
//					String empOid="";
//					Iterator iter=session.createSQLQuery("SELECT oid FROM PomisEmploymentInfo WHERE " +
//							"branchOid="+cmbBranch.getValue()+" AND fundOid= " +cmbFundOrganization.getValue()+
//							" AND opDate='"+dateFormatter.format(date.getValue())+"'")
//							.list().iterator();
//					if(iter.hasNext()){
//						empOid=iter.next().toString();
//
//						}
//
//					if(!empOid.equals("")){
//
//						int oid=Integer.parseInt(empOid);
//					//	if(((int)cmbEmploymentType.getValue())==2)
//						if(cmbEmploymentType.getValue().equals('2'))
//						{
//							sql="UPDATE PomisEmploymentInfo SET " +
//									"ftMaleSE="+fullMale.getValue()+"," +
//									"ftFemaleSE="+fullFemale.getValue()+"," +
//									"ptMaleSE="+partMale.getValue()+"," +
//									"ptFemaleSE= "+partFemale.getValue() +
//									" WHERE oid="+oid;
//							System.out.println("Update sql: "+sql);
//							session.createSQLQuery(sql).executeUpdate();
//						}else{
//							sql="UPDATE PomisEmploymentInfo SET " +
//									"ftMaleWB="+fullMale.getValue()+"," +
//									"ftFemaleWB="+fullFemale.getValue()+"," +
//									"ptMaleWB="+partMale.getValue()+"," +
//									"ptFemaleWB="+partFemale.getValue() +
//									" WHERE oid="+oid;
//							System.out.println("Update sql: "+sql);
//							session.createSQLQuery(sql).executeUpdate();
//						}
//					}else{
//
//					Date d=new Date();
//					String createDate=dateFormatter.format(d);
//				//	if(((int)cmbEmploymentType.getValue())==2)
//					if(cmbEmploymentType.getValue().equals('2'))
//					{
//					sql = "INSERT INTO `PomisEmploymentInfo` " +
//							"(oid,fundOid,branchOid,createDate,opDate,loanCategory,ftMaleSE,ftFemaleSE,ptMaleSE,ptFemaleSE)"+
//							" VALUES ("+id+","+
//							cmbFundOrganization.getValue()+" , "+
//							cmbBranch.getValue()+", '"+
//							createDate+"' , '"+
//							dateFormatter.format(date.getValue())+"' ,"+
//							cmbProduct.getValue()+","+
//							fullMale.getValue()+","+
//							fullFemale.getValue()+","+
//							partMale.getValue()+","+
//							partFemale.getValue()+")";
//
//					System.out.println(sql);
//					session.createSQLQuery(sql).executeUpdate();
//					}else{
//						sql = "INSERT INTO `PomisEmploymentInfo` " +
//								"(oid,fundOid,branchOid,createDate,opDate,loanCategory,ftMaleWB,ftFemaleWB,ptMaleWB,ptFemaleWB)"+
//								" VALUES ("+id+","+
//								cmbFundOrganization.getValue()+" , "+
//								cmbBranch.getValue()+", '"+
//								createDate+"' , '"+
//								dateFormatter.format(date.getValue())+"' ,"+
//								cmbProduct.getValue()+","+
//								fullMale.getValue()+","+
//								fullFemale.getValue()+","+
//								partMale.getValue()+","+
//								partFemale.getValue()+")";
//
//						System.out.println(sql);
//						session.createSQLQuery(sql).executeUpdate();
//					}
//
//				}*/
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
//
//
//    private void setEditable(boolean tf) {
//
//        date.setEnabled(false);
//        cmbBranch.setEnabled(false);
//
//    }
//
//
//
//    private void newBtnAction(ClickEvent e) {
//
//        isFind=false;
//        txtClear();
//        setEditable(true);
//        initialise(true);
//        btnInitialise(false);
//        isUpdate = false;
//
//    }
//    private void initialise(boolean t) {
//        cmbFundOrganization.setEnabled(t);
//        date.setEnabled(t);
//        cmbBranch.setEnabled(t);
//        cmbProduct.setEnabled(t);
//        cmbEmploymentType.setEnabled(t);
//        fullMale.setEnabled(t);
//        fullFemale.setEnabled(t);
//        partMale.setEnabled(t);
//        partFemale.setEnabled(t);
//        labelL.setEnabled(t);
//        labelR.setEnabled(t);
//
//
//    }
//    private void btnInitialise(boolean t) {
//        btnNew.setEnabled(t);
//        btnUpdate.setEnabled(t);
//        btnSave.setEnabled(!t);
//        btnRefresh.setEnabled(!t);
//        btnFind.setEnabled(t);
//    }
//
//    private void txtClear() {
//        cmbFundOrganization.setValue(null);
//        cmbBranch.setValue(null);
//        date.setValue(null);
//
//
//        //	date.setValidToDate();
//        cmbEmploymentType.setValue(null);
//        fullMale.setValue(null);
//        fullFemale.setValue(null);
//        partMale.setValue(null);
//        partFemale.setValue(null);
//
//    }
//    private void setOperationDate() {
//
//        Session session = null;
//        try{
//            session = SessionFactoryUtil.getInstance(db).openSession();
//
//            branchOp = session
//                    .createSQLQuery(
//                            "SELECT DATE_FORMAT(MAX(operationDate),'%Y-%m-%d') FROM DayEndLog WHERE IFNULL(branchOid,'"+ cmbBranch.getValue() + "') = '"+ cmbBranch.getValue() + "' ").list().iterator().next().toString();
//
//            try {
//                date.setValue(dateFormatter.parse(branchOp));
//                date.setValidToDate(dateFormatter.parse(branchOp));
//
//                //	date.setR
//                System.out.println(" Date = "+date.getValue());
//            } catch (ReadOnlyException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (ConversionException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (ParseException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//
//
//
//        } catch (Exception exp) {
//            this.sessionBean.getRootWindow().showNotification("",
//                    "Exception occurred.",Notification.TYPE_ERROR_MESSAGE);
//            new ErrorHandler(this.sessionBean,exp);
//
//        } finally {
//            try {
//                if (session.isOpen()) {
//                    session.close();
//                }
//            } catch (Exception exp) {
//                this.sessionBean.getRootWindow().showNotification("",
//                        "Exception occurred.",Notification.TYPE_ERROR_MESSAGE);
//                new ErrorHandler(this.sessionBean,exp);
//            }
//        }
//
//    }
//
//}
