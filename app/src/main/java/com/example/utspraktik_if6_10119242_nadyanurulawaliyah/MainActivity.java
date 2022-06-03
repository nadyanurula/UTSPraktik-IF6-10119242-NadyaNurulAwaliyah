package com.example.utspraktik_if6_10119242_nadyanurulawaliyah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

        EditText edt_nik, edt_nama, edt_tgl_lahir, edt_jenis, edt_tgl_konfir;
        RadioButton radiocowo, radiocewe, rortu, rnikah, ranak, rlainnya,radiorapid, radiopc;
        Button btn_simpan;
        String nik, nama, tgl_lahir, jkelamin, hub, jenis, tgl;
        RadioGroup rg, rg2,ja;
        String tempJK, temp2, tempJT;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            radiorapid=(RadioButton)findViewById(R.id.ra) ;
            radiorapid.setOnClickListener(null);
            radiopc=(RadioButton)findViewById(R.id.pc);
            radiopc.setOnClickListener(null);
            ja=(RadioGroup)findViewById(R.id.ja);
            ja.setOnCheckedChangeListener(this::onCheckedChanged3);
            edt_tgl_konfir=(EditText)findViewById(R.id.tgl);
            edt_nik=(EditText)findViewById(R.id.nik);
            edt_nama=(EditText)findViewById(R.id.nama);
            edt_tgl_lahir=(EditText)findViewById(R.id.tgl_lahir);
            radiocowo=(RadioButton)findViewById(R.id.cowo);
            radiocowo.setOnClickListener(null);
            radiocewe=(RadioButton)findViewById(R.id.cewe);
            radiocewe.setOnClickListener(null);
            rg=(RadioGroup)findViewById(R.id.rg);
            rg.setOnCheckedChangeListener(this::onCheckedChanged);

            rortu=(RadioButton)findViewById(R.id.ortu);
            rnikah=(RadioButton)findViewById(R.id.nikah);
            ranak=(RadioButton)findViewById(R.id.anak);
            rlainnya=(RadioButton)findViewById(R.id.lainnya);
            rg2=(RadioGroup)findViewById(R.id.rg2) ;
            rg2.setOnCheckedChangeListener(this::onCheckedChanged2);




            btn_simpan=(Button)findViewById(R.id.simpan);
            btn_simpan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    jenis=tempJT.toString();
                    tgl=edt_tgl_konfir.getText().toString();
                    nik=edt_nik.getText().toString();
                    nama=edt_nama.getText().toString();
                    tgl_lahir=edt_tgl_lahir.getText().toString();
                    jkelamin=tempJK.toString();
                    hub=temp2.toString();



                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("Jenis", jenis);
                    i.putExtra("Tgl_konfir", tgl);
                    i.putExtra("Nik", nik);
                    i.putExtra("Nama", nama);
                    i.putExtra("Tgl_lahir", tgl_lahir);
                    i.putExtra("Jk", jkelamin);
                    i.putExtra("Hub", hub);
                    startActivity(i);

                }
            });
        }

        private void onCheckedChanged3(RadioGroup arg0, int arg1) {
            if(radiorapid.isChecked()){
                tempJT = "Rapid Antigen";
            }
            if(radiopc.isChecked()){
                tempJT = "PCR";
            }
        }

        public void onCheckedChanged(RadioGroup arg0, int arg1) {
            if(radiocowo.isChecked()){
                tempJK = "Pria";
            }
            if(radiocewe.isChecked()){
                tempJK = "Wanita";
            }
        }

        public void onCheckedChanged2(RadioGroup arg0, int arg1) {

            if(rortu.isChecked()){
                temp2 = "Orang Tua";
            }
            if(rnikah.isChecked()){
                temp2 = "Suami/Istri";
            }
            if(ranak.isChecked()){
                temp2 = "Anak";
            }
            if(rlainnya.isChecked()){
                temp2 = "Hubungan Lainnya";
            }
        }
    }
