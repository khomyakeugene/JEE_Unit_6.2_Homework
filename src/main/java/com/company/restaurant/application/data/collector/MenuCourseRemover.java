package com.company.restaurant.application.data.collector;

import com.company.restaurant.application.data.service.Executor;

/**
 * Created by Yevhen on 02.06.2016.
 */
public class MenuCourseRemover extends MenuCourseCollector implements Executor {
    @Override
    public void execute() {
        delItemsFromObject();
    }
}
