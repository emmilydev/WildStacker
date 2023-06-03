package com.bgsoftware.wildstacker.api.objects.visitor;

import com.bgsoftware.wildstacker.api.objects.StackedObject;
import org.bukkit.event.Event;

/**
 * An instance of this class allows you
 * to visit event-handled stacked object
 * operations, such as stacked objects place,
 * break or click.
 */
public interface StackedObjectVisitor {
    /**
     * Visits the given {@code event} where the
     * given {@code stackedObject} is involved.
     *
     * @param stackedObject The involved stacked object.
     * @param event The source bukkit event.
     * @return {@code true} if the remaining code in the
     * listener should be ignored, {@code false} otherwise.
     */
    boolean visit(StackedObject<?> stackedObject, Event event);
}
