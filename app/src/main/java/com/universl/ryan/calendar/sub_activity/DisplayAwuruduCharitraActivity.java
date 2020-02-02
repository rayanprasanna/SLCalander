package com.universl.ryan.calendar.sub_activity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.universl.ryan.calendar.R;

import java.util.ArrayList;
import java.util.Objects;

public class DisplayAwuruduCharitraActivity extends AppCompatActivity {

    ArrayList<String> charitra = new ArrayList<>();
    TextView title,charitra_text;
    ImageView image;

    @SuppressLint("SetTextI18n")
    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_awurudu_charitra);

        Toolbar toolbar = findViewById(R.id.search_bar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#ffffff'>අවුරුදු සිරිත් විරිත්</font>"));
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);

        title = findViewById(R.id.awurudu_charithra);
        charitra_text = findViewById(R.id.charitra_text);
        image = findViewById(R.id.image);

        title.setText(getIntent().getStringExtra("charitra"));

        charitra.add("නව සඳ බැලීම");charitra.add("පරණ අවුරුද්ද සඳහා ස්නානය");charitra.add("අලුත් අවුරුදු උදාව");
        charitra.add("පුණ්\u200Dය කාලය");charitra.add("ආහාර පිසීම");charitra.add("වැඩ ඇල්ලීම, ගනුදෙනු කිරීම හා ආහාර අනුභවය");
        charitra.add("හිසතෙල් ගෑම");charitra.add("රැකීරක්ෂා සඳහා පිටත්ව යාම");charitra.add("පැළ සිටුවීම");

        if (charitra.get(0).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.look_new_moon);
            charitra_text.setText("අභිනව චන්ද්\u200Dර වර්ෂය සඳහා අප්\u200Dරේල් මස 07 වන ඉරිදා දින ද, අභිනව සූර්ය වර්ෂය සඳහා මැයි මස\n" +
                    "09 වන බ්\u200Dරහස්පතින්දා දින ද නව සඳ බැලීම මැනවි.");
        }else if (charitra.get(1).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.washing);
            charitra_text.setText("අප්\u200Dරේල් මස 13 වන සෙනසුරාදා දින බෝපත් යුෂ මිශ්\u200Dර නානු ගා ස්නානය කොට ඉෂ්ට දේවතා\n" +
                    "අනුස්මරණයෙහි යෙදී වාසය මැනවි.");
        }else if (charitra.get(2).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.look_new_moon);
            charitra_text.setText("අප්\u200Dරේල් මස 14 වන ඉරිදා දින අපර භාග 02.09 ට සිංහල අලුත් අවුරුද්ද උදා වෙයි.");
        }else if (charitra.get(3).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.good);
            charitra_text.setText("අප්\u200Dරේල් මස 14 වන ඉරිදා පූර්ව භාග 07.45 සිට අපර භාග 08.33 දක්වා පුණ්\u200Dය කාලය බැවින්\n" +
                    "අප්\u200Dරේල් මස 14 වන ඉරිදා දින පූර්ව භාග 07.45 ට පළමුව ආහාර පාන ගෙන සියලු වැඩ අත්හැර\n" +
                    "ආගමික වතාවත්වල යෙදීම ද, පුණ්\u200Dය කාලයේ අපර කොටස තුළ එනම්, 14 වන ඉරිදා දින අපර භාග\n" +
                    "02.09 සිට අපරභාග 08.33 දක්වා පහත දැක්වෙන අයුරින් වැඩ ඇල්ලීම, ගනුදෙනු කිරීම හා ආහාර\n" +
                    "අනුභවය වැනි නැකත් චාරිත්\u200Dර විධි ඉටු කිරීම මැනවි.");
        }else if (charitra.get(4).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.cook);
            charitra_text.setText("අප්\u200Dරේල් මස 14 වන ඉරිදා අපර භාග 02.42 ට රතු සහ කහ මිශ්\u200Dර තඹ පැහැති වස්ත්\u200Dරාභරණයෙන්\n" +
                    "සැරසී නැගෙනහිර දිශාව බලා ලිප් බැඳ, ගිනි මොලවා හකුරු මිශ්\u200Dර කිරිබත් ද, අග්ගලා හා තල මිශ්\u200Dර\n" +
                    "කැවිලි වර්ගයක් ද පිලියෙළ කර ගැනීම මැනවි.");
        }else if (charitra.get(5).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.eat);
            charitra_text.setText("අප්\u200Dරේල් මස 14 වන ඉරිදා අපර භාග 03.54 ට රතු සහ කහ මිශ්\u200Dර (තඹ පැහැති)\n" +
                    "වස්ත්\u200Dරාභරණයෙන් සැරසී නැගෙනහිර දිශාව බලා සියලු වැඩ අල්ලා ගනුදෙනු කොට ආහාර අනුභවය\n" +
                    "මැනවි.");
        }else if (charitra.get(6).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.oil);
            charitra_text.setText("අප්\u200Dරේල් මස 17 වන බදාදා දින පූර්ව භාග 07.40 ට නැගෙනහිර දිශාව බලා හිසට කොහොඹ පත් ද,\n" +
                    "පයට කොළොන් පත් ද තබා පලාවන් පැහැති වස්ත්\u200Dරාභරණයෙන් සැරසී කොහොඹ පත් යුෂ මිශ්\u200Dර\n" +
                    "නානු ද, තෙල් ද ගා ස්නානය කිරීම මැනවි.");
        }else if (charitra.get(7).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.work);
            charitra_text.setText("අප්\u200Dරේල් මස 18 වන බ්\u200Dරහස්පතින්දා පූර්ව භාග 04.52 ට පලාවන් පැහැති වස්ත්\u200Dරාභරණයෙන්\n" +
                    "සැරසී, හකුරු සහ තල මෝරු මිශ්\u200Dර කිරිබතක් අනුභව කොට නැගෙනහිර දිශාව බලා පිටත්ව යෑම\n" +
                    "මැනවි.");
        }else if (charitra.get(8).equalsIgnoreCase(getIntent().getStringExtra("charitra"))){
            image.setBackgroundResource(R.drawable.pala_situwima);
            charitra_text.setText("අප්\u200Dරේල් මස 17 වන බදාදා දින පූර්ව භාග 06.20 ට නැගෙනහිර දිශාව බලා පැළ සිටවනු මැනවි.");
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            Intent intent = new Intent(DisplayAwuruduCharitraActivity.this, AwuruduCharitraActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(DisplayAwuruduCharitraActivity.this, AwuruduCharitraActivity.class);
        startActivity(intent);
        finish();
    }
}
