package kadursandy.com.vasavihostelunion;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
//import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.SearchView;
//import android.view.Gravity;
//import android.view.Menu;
//import android.view.MenuInflater;
import android.view.MenuItem;
//import android.view.View;
//import android.view.inputmethod.EditorInfo;
//import android.widget.Toast;
//import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ExampleAdapter mAdapter;
    private ArrayList<ExampleItem> mExampleList;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleList();
        mAdapter = new ExampleAdapter(mExampleList);
//        buildRecyclerView();

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_draw_open, R.string.navigation_draw_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MessageFragment()).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactsFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_message);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_message:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MessageFragment()).commit();
                break;
//            case R.id.nav_chat:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChatFragment()).commit();
//                break;
//
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commit();
                break;
            case R.id.nav_contacts:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactsFragment()).commit();
                break;

//            case R.id.nav_share:
//                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.nav_send:
//                Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show();
//                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void createExampleList() {
        mExampleList= new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Murahari M K", "Working @ ISRO", "1985-1988", "Bangalore", "+91 7019463114", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Naveen K N", "Working @ Northern Trust", "2007-2012", "Bangalore", "+91 9916449937", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Gangadhar Gupta", "Technical Consultant @ NeilSoft", " 2001-2005", "Bangalore", "+91 9902588697", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Ajith Kumar", "Advocate", "1999-2000", "Bangalore", "+91 9844780238", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Balaji D K", "IAS Officer", "2007-2012", "Paderu, Vishakhapatnam", "+91 7060435830", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Raju S R", "Chemistry Lecturer", "2013-2016", "Bangalore", "+91 8495868126", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sandeep G", "Application Specialist", "2006-2007", "Bangalore", "+91 9449660470", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Punith Kumar B V", "Team lead at Hewllet Packard", "2010-2012", "Bangalore", "+91 9611353605", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Nagendra Kaparthy", "Real Estate, Finance, Pharmacy", "2012-2013", "Chennai", "+91 7411520073", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Bharath", "Consultant @ IBM", "2004-2008", "Bangalore", "+91 9538322042", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Karthik M S", "KAM ( Lung Cancer Department), AstraZeneca", "2004-2008", "Bangalore", "+91 9901083833", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Bharath", "Consultant @ IBM", "2004-2008", "Bangalore", "+91 9538322042", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vitta Saketh", "Working @ Societe Generale", "2010-2012", "Bangalore", "+91 9964907385", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Ravi Chandra R", "Sr Manager @ Standard Chartered Bank", "2005-2008", "Bangalore", "+91 9945737383", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Supreeth", "Technical consultant @ Landmark Groups", "2009-2012", "Bangalore", "+91 9900454662", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Kaushik M", "VLSI verification Engineer @ Ensilica India", "2009-2013", "Bangalore", "+91 7411114027", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Nihal B L", "Marketing Director in Metro paints and chemicals, Alfa coats pvt ltd", "2011-2012", "Bangalore", "+91 9620514198", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Gururaj T", "Business Software development & Govt Supply & Tendering", "2008-2011", "Arsikere & Bangalore", "+91 9880577717", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sudeep Kumar", "Scientific Reviewer, Novartis", "2004-2007", "Hyderabad", "+91 8825862014", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Naganjan S L ", "Asst. Exe. Engg. (Electrical) KPCL", "2002-2004", "Bellary", "+91 9980921242", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vinay Kumar K N", "Chartered Accountant", "2010-2013", "Bangalore", "+91 9060817087", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Shyamsundar B D", "Installations and service textile Humidifier Luwa India pvt Ltd", "2008-2011", "Bangalore", "+91 9845320623", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Arjun", "Working at Delphi Technologies", "2007-2011", "Bangalore", "+91 8105670464", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Srawan", "Working @ Mercedes Benz RD India", "2001-2005", "Bangalore", "+91 9980831407", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Raghav Ellur", "Principal Security Group Manager, Microsoft", "1999-2002", "Hyderabad", "+91 9972331008", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Nagakishor", "Software engineer at Honeywell", "2007-2013", "Bangalore", "+91 9964588989", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Deepak G S", "Asst. Engineer, KPTC", "2010-2011", "Kalaburgi", "+91 9901428001", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Manoj C N", "Software Engg @ TCS", "2008-2012", "Bangalore", "+91 9141918616", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vishnu N R", "Heading Land Acquisition Dept. @ Mantri Developers", "2001-2004", "Bangalore", "+91 9972377448", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Madhusudhana KN", "Tech Lead @ CDK Global", "2008-2010", "Seattle Washington", "+91 9036942665", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Pradeep A G", "Mechanical Engineer @ HCL technologies", "2001-2004", "Germany", "+91 9845833779", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Akshay N V", "Software Engineer @ Microsoft", "2007-2013", "Bangalore", "+91 9480006639", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Suman G V", "Chemistry Lecturer", "2008-2010", "Bangalore", "+91 9741282005", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vinay Bhoopalam", "Associate Director Finance @ Dell EMC", "2001-2003", "Bangalore", "+91 9886092220", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sandeep R", "Software Engineer @ Hewlett Packard Enterprise", "2001-2005", "Bangalore", "+91 9880684866", "kadursandy@gmail.com"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Jeevan S", "Machine Tool Designer @ AIM Tooling systems", "2011-2015", "Bangalore", "+91 9742406481", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vinod Kumar K R", "Dentist(Periodontist)", "2002-2007", "Jimma, Ethiopia", "+91 8861631631", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Ravikumar P", "Assistant Engineer @ KPTCL ", "2009-2013", "Bangalore", "+91 9844549303", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sridhar Shyamanur", "Chief Information Officer @ Infobotique Services Pvt Ltd", "2002-2006", "Chickmaglur, Settled at MUSCAT", "+91 9844557665", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Pranam K V", "Quality Engineer @ Infosys Ltd.", "2001-2005", "Sacramento, California", "+1 507 407 0007", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vinay NK", "Architect , Propriter VISHISHTA ARCHITECTS", "2002-2003", "Bangalore", "+91 9986029694", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Akshay Kumar", "MTECH STRUCTURAL ENGINEERING,RVCE", "2012-2014", "Bidar", "+91 9611647313", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Santhosh", "Sr Software Engineer @ Microsoft", "2000-2004", "Redmond Washington", "+1 971 312 7297", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sandesh B N", "Profession/Business - Asst. Manager @ Utility projects and services Pvt Ltd", "2006-2010", "Bangalore", "+91 9611385811", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Kartheek S S", "Jeweller", "2003-2006", "Bangalore", "+91 9886096886", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Aravind D", "ADL @ Cipla", "2006-2008", "Bangalore", "+91 9880202018", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Phani Raghava Lakkisetty", "Dentist(maxillofacial surgeon)", "2001-2005", "Anantapur, AP", "+91 9959432050", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "", "", "2001-2005", "Bangalore", "+91 ", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Krishna Chaitanya", "Application Development Manager @ Accenture", "2001-2004", "New Jersey USA", "+1 973 727 0418", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vishnu Bysani", "Manager at ICICI Bank", "2008-2011", "Hospet", "+91 8123456457", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Samarth K V", "Site Engineer @ Hombale Constructions Ltd", "2012-2013", "Gubbi, Tumkur", "+91 9481465504 ", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sandesh Shivapuram", "Edible Oil Manufacturing & Refining Unit", "2004-2006", "Gauribidanur", "+91 9886272287", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vamsi S", "Jeweller", "2003-2005", "Madanapalle", "+91 9885958527", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sagar", "Manager (Analytics HSBC)", "2004-2006", "Bangalore", "+91 9986476552", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vivek V Roy", "Developer in Wipro", "2012-2013", "Bangalore", "+91 8722932727", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Raghavendra M ", "Civil Site Engineer", "2012-2016", "Bangalore", "+91 8892923481", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vaibhav K R", "Retail & Restaurant Business", "2004-2005", "Bangalore", "+91 9886858899", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Gourav Kanchi", "EMC Engineer at MBtech EMC GmbH", "2008-2014", "Ingolstadt, Germany", "+49 176 80813618", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Dr Nagaraju B A ", "Consultant, Pediatrician and Neonatologist ", "2000-2004", "Madhugiri, Tumkur", "+91 9945353132", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Ramesh R", "Assistant professor", "2010-2012", "Kolar", "+91 9738507521", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sumanth", "Technical Lead @ First American India", "2000-2004", "Bangalore", "+91 9739066640", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vasudev M N", "Retail Pharmacy, Clinic & Blood Pathology lab", "2008-2011", "Chikmagalur", "+91 9449713201", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Dr Nagendra Kumar V R", "Consultant in  Pediatrics, Pediatric Gastroenterology and Hepatology", "2000-2004", "Bangalore", "+91 8874488274", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vinay T R", "Real Estate Builders and Land Developers", "2001-2004", "Shimoga", "+91 9008011899", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Shravan Kumar RD", "Software engineer @ Cognizant", "2006-2010", "Bangalore", "+91 9986122022", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Srinath R", "Sr. Engineer @ ROBERT BOSCH", "2006-2010", "Bangalore", "+91 9481935175", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sunil Kumar Kaparthy", "Software engineer @ TCS", "2006-2010", "Bergen, Norway", "+91 7738363942", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Dr Venkatesh Gupta K V", "Consultant Intensivist (Critical Care Medicine), Manipal Hospital", "1999-2003", "Bangalore", "+91 9538895391", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Gopinatha P R", "Software developer @ British Telecom", "2010-2013", "Bangalore", "+91 9663882498", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Naveen TG", "Working @ SonicWall in Cyber Security Field", "1999-2002", "Bangalore", "+91 9886862635", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Anilkumar Thovi", "Manager @ Cognizant", "2001-2004", "Bangalore", "+91 97399816612", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Akshay A", "Asst. Technical Manager @ Axiscades", "2001-2005", "Bangalore", "+91 9886672564", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Venugopal S", "Sr GL Microbiology dept @ Mylan Laboratories Ltd", "2001-2003", "Bangalore", "+91 9886718258", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Madhukara Komarla", "Self Employed", "2000-2005", "Chintamani", "+91 8971944131", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Shivaprakash M", "Senior lead @ Brillio", "2002-2006", "Washington DC,USA", "+91 9945577998", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Nagarjuna Y S", "Senior Diagnostic Specialist", "1998-2001", "Bangalore", "+91 9886380180", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Udaya Kiran S S", "Senior Product Engineering Manager", "1998-2001", "Bangalore", "+91 9611773600", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Dr Gopi Krishna", "Working in Dhatri Ayurdhama, Attiguppe", "2012-2013", "Bangalore", "+91 7760121565", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Venkatesh Babu", "Assistant engineer, water resources dept,GoK", "2010-2013", "Chintamani", "+91 9591804152", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Vinay K", "Team lead @ Accenture", "2002-2005", "Bangalore", "+91 9538000678", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Bharath S", "Woking @ Dentsu Aiges Network", "2008-2010", "Bangalore", "+91 7411612601", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Sreekanth Setty", "Swetha Jewellers, Penukonda", "2000-2003", "Bangalore", "+91 7842203989", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Narendra Babu", "Moody’s Analytics", "2000-2003", "Bangalore", "+91 9901280873", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Harish G Chinnari", "Associate Director - R&D, Slayback Pharma", "1998-2005", "Bangalore", "+91 8411971246", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Harisha", "Software Engineer @ Envestnet Yodlee", "2010-2013", "Bangalore, Honnena Halli, SIRA, Tumkur", "+91 9880647735", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Rajesh Rajah", "Sr Manager, Tesla", "1996-2000", "Sanfrancisco Bay Area", "+1 919 802 1177", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Chetan S", "Project Manager @ Wipro", "1999-2001", "Bangalore, SIRA", "+91 9886749060", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Nagarjun NP", "Principal Architect -PROJECT O9", "2009-2013", "Holavanahally, Koratagere", "+91 9164257200", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Shabareesha", "Banking Sector", "1997-2001", "Bangalore", "+91 9703146549", "----"));
        mExampleList.add(new ExampleItem(R.drawable.ic_person, "Parashuram", "Textile Industry", "1997-2001", "Bangalore", "+91 8147507940", "----"));
    }

    public void buildRecyclerView() {
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.example_menu, menu);
//
//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) searchItem.getActionView();
//
//        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                mAdapter.getFilter().filter(s);
//                return false;
//            }
//        });
//
//        return true;
//    }
}
