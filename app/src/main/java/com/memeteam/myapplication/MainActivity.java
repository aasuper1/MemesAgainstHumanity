package com.memeteam.memedisplay;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.service.dreams.DreamService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] memeArray;
    ImageView memeContianer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        LinearLayout main = (LinearLayout) findViewById(R.id.activity_main);
        memeContianer = new ImageView(this);
        Random rand = new Random();
        int  n = rand.nextInt(35) + 0;
        memeContianer.setImageResource(memeArray[n]);
        memeContianer.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        main.addView(memeContianer);
    }

    public void memeGenerator(View view){
        Random rand = new Random();
        int  n = rand.nextInt(35) + 0;
        memeContianer.setImageResource(memeArray[n]);
    }
    private void init() {

        memeArray = new int[]{
                R.drawable.aa_does_not_simply,
                R.drawable.ab_beter,
                R.drawable.ad_batman_slap,
                R.drawable.ae_batman_slap,
                R.drawable.af_aliens,
                R.drawable.ag_interesting_man,
                R.drawable.ah_futurama,
                R.drawable.ai_buzz_everywhere,
                R.drawable.aj_leonardo,
                R.drawable.ak_first_world_problems,
                R.drawable.al_waiting_skeleton,
                R.drawable.am_brace_yourselves,
                R.drawable.an_none_of_my_business,
                R.drawable.ao_y_u_no_do_dis,
                R.drawable.ap_great,
                R.drawable.aq_doge,
                R.drawable.ar_oprah,
                R.drawable.as_facepalm,
                R.drawable.at_meeting,
                R.drawable.au_success_kid,
                R.drawable.av_grumpy_cat,
                R.drawable.aw_so_youre_telling_me,
                R.drawable.ax_get_all_the,
                R.drawable.ay_matrix,
                R.drawable.az_wtf,
                R.drawable.ba_bruh,
                R.drawable.bb_rock,
                R.drawable.bc_face_you_make,
                R.drawable.bd_fire_girl,
                R.drawable.be_evil_toddler,
                R.drawable.bf_am_i_the_only_one,
                R.drawable.bg_too_damn_high,
                R.drawable.bh_grandma,
                R.drawable.bi_third_world,
        };

    }
}
