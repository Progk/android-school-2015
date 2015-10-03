package com.elegion.githubclient.adapter.decoration;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.elegion.githubclient.R;

/**
 * Created by sergey on 02.10.15.
 */
public class RepositoryDecoration extends RecyclerView.ItemDecoration {
    public RepositoryDecoration() {
        super();
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int offset = view.getResources().getDimensionPixelOffset(R.dimen.padding_medium);
        outRect.offset(offset, offset);
    }
}
