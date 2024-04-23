package org.example;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view:88888;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main {

    private static class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private String[] mData;

        public MyAdapter(String[] data) {
            this.mData = data;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.bind(mData[position]);
        }

        @Override
        public int getItemCount() {
            return mData.length;
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
            private TextView mTextView;

            public ViewHolder(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView;
            }

            public void bind(String text) {
                mTextView.setText(text);
            }
        }
    }

    public static void main(String[] args) {
        RecyclerView recyclerView = new RecyclerView(null);
        recyclerView.setAdapter(new MyAdapter(new String[]{"Item 1", "Item 2", "Item 3"}));

        // You might also want to set some layout manager like LinearLayoutManager.
        // recyclerView.setLayoutManager(new LinearLayoutManager(null));
    }
}