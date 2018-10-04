package com.example.fragmentsample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    private static final String NAME_KEY = "NAME_KEY";

    public static Fragment newInstance(@NonNull final String name) {
        final Fragment fragment = new DetailFragment();

        final Bundle arguments = new Bundle();
        arguments.putString(NAME_KEY, name);

        fragment.setArguments(arguments);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull final LayoutInflater inflater,
            @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detatil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final TextView textView = view.findViewById(R.id.detailTextView);

        final String name = getArguments().getString(NAME_KEY);
        textView.setText(name);
    }
}
