package Day11_XanhMail;

import org.apache.xalan.xsltc.compiler.sym;

public class Locator_Day11 {
	public static final String CHROME_PATH = ".//driver//chromedriver.exe";
	public static final String BASE_URL = "http://live.guru99.com/";
	
	public static final String B_MenuMOBIE=".//*[@id='nav']/ol/li[1]/a";
	
	public static final String Se_SORTBY=".//select[contains(@title,'Sort By')]";
	public static final String All_items=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[2]/div/p/strong";
	
	public static final String TenSP=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a";
	public static final String GiaSP=".//*[@id='product-price-1']/span";
	public static final String GiaCT=".//*[@id='product-price-1']/span";
	
	public static final String Click_SP=".//*[@id='product-collection-image-1']";
	//ADD TO CART
	public static final String B_AddToCart=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button";
	public static final String S_SL=".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input";
	public static final String C_Update=".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button";
	public static final String G_TBSL=".//*[@id='shopping-cart-table']/tbody/tr/td[2]/p";
	public static final String C_EMPTYCART=".//*[@id='empty_cart_button']";
	public static final String G_TBEmptyCart=".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]";
	
	//COMPARE
	public static final String G_SONY="//h2/a[@title='Sony Xperia']";
	public static final String G_IPHONE="//h2/a[@title='IPhone']";
	public static final String C_AddToCartSony=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a";
	public static final String C_AddToCartIphone=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a";
	public static final String B_Compare=".//*[@id='top']/body/div[1]/div/div[2]/div/div[3]/div[1]/div[2]/div/button";
	public static final String G_HeadCompare=".//*[@id='top']/body/div[1]/div[1]/h1";
	public static final String G_SONYChitiet=".//*[@id='product_comparison']/tbody[1]/tr[1]/td[1]/h2/a";
	public static final String G_IPHONEChitiet=".//*[@id='product_comparison']/tbody[1]/tr[1]/td[2]/h2/a";
	public static final String B_Closepopup="//button[@title='Close Window']";
	//REGISTER
	public static final String C_MyAccount=".//*[@id='top']/body/div[1]/div/div[3]/div/div[4]/ul/li[1]/a";
	public static final String C_CreateAccount=".//*[@id='login-form']/div/div[1]/div[2]/a/span/span";
	public static final String S_FirstName=".//*[@id='firstname']";
	public static final String S_MiddleName=".//*[@id='middlename']";
	public static final String S_LastName=".//*[@id='lastname']";
	public static final String S_Pass=".//*[@id='password']";
	public static final String S_ConfirmPass=".//*[@id='confirmation']";
	public static final String S_Email=".//*[@id='email_address']";
	public static final String C_Register=".//*[@id='form-validate']/div[2]/button";
	public static final String G_XacNhanDK=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/p[1]/strong";
	//WishtList
	public static final String C_menuTV=".//*[@id='nav']/ol/li[2]/a";
	public static final String G_LG=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/h2/a";
	public static final String C_AddWishlistLG=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a";
	public static final String G_LGChitiet="//a[contains(@title,'LG LCD')and contains(text(),'LG LCD')]";
	public static final String B_ShareWishlist1=".//*[@id='wishlist-view-form']/div/div/button[1]";
	public static final String S_EmailTextarea=".//*[@id='email_address']";
	public static final String S_MessTextagdrea=".//*[@id='message']";
	public static final String B_ShareWishlist2=".//*[@id='form-validate']/div[2]/button";
	public static final String G_CheckWishlist=".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span";
	
	public static final String S_EmailDN=".//*[@id='email']";
	public static final String S_PassDN=".//*[@id='pass']";
	public static final String C_Login=".//*[@id='send2']";
	
	public static final String C_MyWishlist=".//a[contains(text(),'My Wishlist')]";
	public static final String C_AddToCart=".//button[contains(@title,'Add to Cart')]";
	public static final String C_ProceedToCheckout=".//*[@id='top']/body/div[1]/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button";
	
	public static final String Se_Country=".//*[@id='country']";
	public static final String Se_State=".//*[@id='region_id']";
	public static final String S_ZIP=".//*[@id='postcode']";
	public static final String C_Estimate=".//button[contains(@title,'Estimate')]";
	
	public static final String G_FlatRate=".//*[@id='co-shipping-method-form']/dl/dt";
	public static final String G_FlatRateSo=".//*[@id='co-shipping-method-form']/dl/dd/ul/li/label/span";
	public static final String R_FlatRateSo=".//*[@id='s_method_flatrate_flatrate']";
	public static final String C_Logi2=".//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span";
	public static final String G_Shipping=".//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span";
	public static final String C_UpdateTotal=".//button[contains(@value,'Update Total')]";
	public static final String G_SubTotal=".//*[@id='shopping-cart-totals-table']/tbody/tr[1]/td[2]/span";//Tổng tiền hàng
	public static final String G_GrandTotal=".//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span";// tổng tiền hàng + Ship
	public static final String C_ProceedCheckout=".//button[contains(@title,'Proceed to Checkout')]";
	public static final String C2_2="";
	public static final String C_Loggin2="";
	public static final String C_Logign2="";
	public static final String C_Logegi2="";
	public static final String C_Lf="";
	public static final String C_Logcvbin2="";
	public static final String C_Logdbin2="";
	public static final String C_Logc7vbin2="";
	
	
	
	
}
