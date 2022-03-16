package com.example.dashboard;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class doctor extends Fragment {

    public doctor() {
        // Required empty public constructor
    }



    RecyclerView rcv;
    myadapter adapter;
    SearchView searchView;
    ArrayList<Model> holder;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_doctor, container, false);


        searchView = (SearchView) view.findViewById(R.id.search_view);
        rcv = (RecyclerView) view.findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(rcv.getContext()));

        adapter = new myadapter(dataqueue());
        rcv.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

        return view;
    }

    private void filter(String newText) {

        List<Model> filteredList = new ArrayList<>();
        for(Model item: holder)
        {
            if(item.get3().toLowerCase().contains(newText.toLowerCase()) )
            {
                filteredList.add(item);
            }




        }


        adapter.filteredList(filteredList);
    }

    public ArrayList<Model> dataqueue()
    {

        holder  = new ArrayList<>();

        Model ob1 = new Model();
        ob1.setHeader("Dr. Akash Shah");
        ob1.setDesc("MBBS, MD - General medicine, Oncologist");
        ob1.setDesc3("Plot Number 1 A, Bhat GIDC Estate, Landmark: Near Narayani Hotel, Ahmedabad \n Mo :9426050671");
        ob1.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setHeader("Dr. Tapan Shah");
        ob2.setDesc("MBBS, MD - General medicine, Physician");
        ob2.setDesc3("1st Floor Santorini Square, Behind Abhishree Complex, Opp Star Bazaar Lane, Landmark: Opp Star Bazzar, Ahmedabad \n Mo :9925010599");
        ob2.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setHeader("Dr. Hardik Khamar");
        ob3.setDesc("MD, Homeopathy");
        ob3.setDesc3("101 , Aishwarya Complex, 2 , Prakash Nagar , Jawahar Chowk., Landmark: Opposite Shell petrol pump, Ahmedabad \n Mo :07925464617");
        ob3.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setHeader("Dr. Rupa Tejas Shah");
        ob4.setDesc("MBBS , DVD , cosmetologist");
        ob4.setDesc3("6-B, Devang Park, Panjarapole Cross Roads., Landmark: Near Topaz & Vaibhav Restaurant, Ahmedabad \n Mo :07926303233");
        ob4.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setHeader("Dr. Paresh Thakkar");
        ob5.setDesc("BAMS, Ayurveda");
        ob5.setDesc3("32, Raj Ami Complex, Amin Society, Sardar Patel Colony, Naranpura, Landmark: Near Swastik School, Ahmedabad\n Mo: 09825012468");
        ob5.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setHeader("Dr. Nehal Sadhu");
        ob6.setDesc("MBBS, MD - Medicine, Blood pressure");
        ob6.setDesc3("D-1 Block Shantiniketan Appartment, Memnagar., Landmark: HB Kapadia School, Ahmedabad\n Mo: 094260 50005");
        ob6.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setHeader("Dr. Snehal K. Trivedi");
        ob7.setDesc("DNB - General Medicine, MBBS, Sugar");
        ob7.setDesc3("101/2, First Floor, Shalvik Avenue, Above Reliance Fresh, Naranpura Cross Road, Landmark: Near Police Chowki, Ahmedabad\n Mo :9825700321");
        ob7.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob7);

        Model ob8 = new Model();
        ob8.setHeader("Dr. Harshil Pandya");
        ob8.setDesc("MD - Tuberculosis & Respiratory Diseases/Medicine");
        ob8.setDesc3("Second Floor, Shivsagar Complex, Landmark: Near Gopi Bungalows & Mahadevnagar Tekra, Ahmedabad\n Mo :079-25331810");
        ob8.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob8);

        Model ob9 = new Model();
        ob9.setHeader("Dr. Jayesh Pavra");
        ob9.setDesc("MBBS, MD - Medicine");
        ob9.setDesc3("508 5th floor Shivalik Satyamev, Landmark: Near Vakil Saheb Bridge, Ahmedabad\n Mo :9824032300");
        ob9.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob9);

        Model ob10 = new Model();
        ob10.setHeader("Dr. S J Metalia");
        ob10.setDesc("MBBS, MD - General Medicine, Physician");
        ob10.setDesc3("9/99, Vallabh Flat, Landmark: Near Diamond Market, Ahmedabad\n Mo :9408784881");
        ob10.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob10);

        Model ob11 = new Model();
        ob11.setHeader("Dr. Dhaval Patel");
        ob11.setDesc("MBBS, MS - General Surgery, Surgeon");
        ob11.setDesc3("Naina Eye Hospital, 104, Spectrum building Swami Vivekanand chowk, Near Gurukul road, Memnagar, Ahmedabad\n Mo :9913330081");
        ob11.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob11);

        Model ob12 = new Model();
        ob12.setHeader("Dr. Bhaumik Shah");
        ob12.setDesc("MBBS, MS - Obstetrics & Gynaecology");
        ob12.setDesc3("2nd Floor, Vandematram Arcade, Chandlodiya, Landmark: New S.G Road, Ahmedabad\n Mo :9409116803");
        ob12.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob12);

        Model ob13 = new Model();
        ob13.setHeader("Dr. Dhaval Shah");
        ob13.setDesc("MBBS, MD - Obstetrics & Gynaecology");
        ob13.setDesc3("100 Feet Road, Prahladnagar, Landmark: Opposite Shell Petrol Pump, Near Ishaan 3, Ahmedabad\n Mo :9824057508");
        ob13.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob13);

        Model ob14 = new Model();
        ob14.setHeader("Dr. Upendra Patel");
        ob14.setDesc("MBBS, MD - General Medicine");
        ob14.setDesc3("A 207-210 Swaminarayan Avenue AEC CROSS ROADS Naranpura, Ahmedabad\n Mo :9723220274");
        ob14.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob14);

        Model ob15 = new Model();
        ob15.setHeader("Dr. Irbaz Turk");
        ob15.setDesc("MD - Pediatrics");
        ob15.setDesc3("Merlin pentagone, mahalakshmi panch rasta, Paldi , Landmark: mahalaxmi five road, Ahmedabad\n Mo : -");
        ob15.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob15);

        Model ob16 = new Model();
        ob16.setHeader("Dr. Lal Daga");
        ob16.setDesc("MBBS, DNB - General Medicine, DNB - Cardiology");
        ob16.setDesc3("Helmet Circle, Drive In Rd., Landmark: near Manav Mandir., Ahmedabad\n Mo :099712 05727");
        ob16.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob16);

        Model ob17 = new Model();
        ob17.setHeader("Dr. Hemang Zala");
        ob17.setDesc("BDS, Fellowship in Oral implantlogy, Certificate in Cosmetic Dentistry, MDS - Oral Pathalogy & Microbiology");
        ob17.setDesc3("208-9, Sahajanand Palace, 100 Feet Ring Road, Landmark: Opposite Rahul Tower, Ahmedabad\n Mo :097264 22303");
        ob17.setImgname(R.drawable.ic_launcher_background);
        holder.add(ob17);


        return holder;

    }
}