package kadursandy.com.vasavihostelunion;

public class ExampleItem {
    private int mImageResource;
    private String mPersonName;
    private String mProfession;
    private String mBatch;
    private String mPlace;
    private String mContact;
    private String mEmail;

    public int getImageResource() {
        return mImageResource;
    }

    public String getPersonName() {
        return mPersonName;
    }

    public String getProfession() {
        return mProfession;
    }

    public String getBatch() {
        return mBatch;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getContact() {
        return mContact;
    }

    public String getEmail() {
        return mEmail;
    }


    public ExampleItem(int imageResource, String personName, String profession, String batch, String place, String contact, String email) {
        mImageResource = imageResource;
        mPersonName = personName;
        mProfession = profession;
        mBatch = batch;
        mPlace = place;
        mContact = contact;
        mEmail = email;
    }
}
