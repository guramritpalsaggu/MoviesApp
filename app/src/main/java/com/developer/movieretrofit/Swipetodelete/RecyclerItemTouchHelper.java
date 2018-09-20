//package com.developer.movieretrofit.Swipetodelete;
//
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.helper.ItemTouchHelper;
//import android.view.View;
//
//import com.developer.movieretrofit.Adapter.MoviesAdapter;
//import com.developer.movieretrofit.JsonClasses.Movie;
//
//public class RecyclerItemTouchHelper extends ItemTouchHelper.SimpleCallback {
//
//    private RecyclerItemTouchHelperListener listener;
//
//    public RecyclerItemTouchHelper(int dragDirs, int swipeDirs) {
//        super(dragDirs, swipeDirs);
//        this.listener=listener;
//    }
//
//    @Override
//    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
//        return true;
//    }
//
//    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder,int actionState){
//        if (viewHolder != null) {
//            final View foregroundView = ((MoviesAdapter.MovieViewHolder) viewHolder).viewForeground;
//
//            getDefaultUIUtil().onSelected(foregroundView);
//        }
//    }
//    }
//
//    @Override
//    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
//
//    }
//}
