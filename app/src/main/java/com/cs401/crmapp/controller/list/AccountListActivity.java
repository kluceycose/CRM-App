package com.cs401.crmapp.controller.list;

import androidx.fragment.app.Fragment;

import com.cs401.crmapp.controller.SingleFragmentActivity;

public class AccountListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new AccountListFragment();
    }
}
