package app.irvanyale.com.academy.ui.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.irvanyale.com.academy.R;
import app.irvanyale.com.academy.data.ModuleEntity;

/**
 * Created by irvan on 1/23/2020.
 */
public class DetailCourseAdapter extends RecyclerView.Adapter<DetailCourseAdapter.ModuleViewHolder> {

    private List<ModuleEntity> listModules = new ArrayList<>();

    void setModules(List<ModuleEntity> modules) {
        if (modules == null) return;
        listModules.clear();
        listModules.addAll(modules);
    }

    @NonNull
    @Override
    public ModuleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_module_list, parent, false);
        return new ModuleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModuleViewHolder viewHolder, int position) {
        ModuleEntity module = listModules.get(position);
        viewHolder.bind(module);
    }

    @Override
    public int getItemCount() {
        return listModules.size();
    }

    class ModuleViewHolder extends RecyclerView.ViewHolder {
        final TextView textTitle;

        ModuleViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.text_module_title);
        }

        void bind(ModuleEntity module) {
            textTitle.setText(module.getTitle());
        }
    }
}
