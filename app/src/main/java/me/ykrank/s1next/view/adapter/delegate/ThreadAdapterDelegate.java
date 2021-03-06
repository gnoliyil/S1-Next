package me.ykrank.s1next.view.adapter.delegate;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import javax.inject.Inject;

import me.ykrank.s1next.App;
import me.ykrank.s1next.R;
import me.ykrank.s1next.data.api.model.Thread;
import me.ykrank.s1next.data.pref.ThemeManager;
import me.ykrank.s1next.databinding.ItemThreadBinding;
import me.ykrank.s1next.viewmodel.ThreadViewModel;
import me.ykrank.s1next.viewmodel.UserViewModel;

public final class ThreadAdapterDelegate extends BaseAdapterDelegate<Thread, ThreadAdapterDelegate.BindingViewHolder> {

    @Inject
    UserViewModel mUserViewModel;

    @Inject
    ThemeManager mThemeManager;

    private final String forumId;

    public ThreadAdapterDelegate(Context context, String forumId) {
        super(context);
        this.forumId = forumId;

        App.getAppComponent().inject(this);
    }

    @NonNull
    @Override
    protected Class<Thread> getTClass() {
        return Thread.class;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        ItemThreadBinding binding = DataBindingUtil.inflate(mLayoutInflater, R.layout.item_thread,
                parent, false);
        // we do not use view model for ThemeManager
        // because theme changes only when Activity recreated
        binding.setUserViewModel(mUserViewModel);
        binding.setThemeManager(mThemeManager);
        binding.setForumId(forumId);
        binding.setModel(new ThreadViewModel());

        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolderData(Thread thread, int position, @NonNull BindingViewHolder holder, @NonNull List<Object> payloads) {
        if (thread == null){
            return;
        }
        ItemThreadBinding binding = holder.itemThreadBinding;
        binding.getModel().thread.set(thread);
        binding.executePendingBindings();
    }

    static final class BindingViewHolder extends RecyclerView.ViewHolder {

        private final ItemThreadBinding itemThreadBinding;

        public BindingViewHolder(ItemThreadBinding itemThreadBinding) {
            super(itemThreadBinding.getRoot());

            this.itemThreadBinding = itemThreadBinding;
        }
    }
}
