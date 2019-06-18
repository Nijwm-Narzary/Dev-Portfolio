package devportfolio.buildappswithpaulo.com.deveportfolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import devportfolio.buildappswithpaulo.com.deveportfolio.views.AboutFragment;
import devportfolio.buildappswithpaulo.com.deveportfolio.views.ContactFragment;
import devportfolio.buildappswithpaulo.com.deveportfolio.views.SkillsFragment;
import devportfolio.buildappswithpaulo.com.deveportfolio.views.WorkFragment;

/**
 * Created by paulodichone on 11/6/17.
 */

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return null;
    }
}
