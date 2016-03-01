package org.insightech.er.editor.view.action.outline.notation.type;

import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Event;
import org.insightech.er.ResourceString;
import org.insightech.er.editor.controller.command.display.outline.ChangeOutlineViewModeCommand;
import org.insightech.er.editor.model.ERDiagram;
import org.insightech.er.editor.model.settings.Settings;
import org.insightech.er.editor.view.action.outline.AbstractOutlineBaseAction;

public class ChangeOutlineViewToLogicalAction extends AbstractOutlineBaseAction {

    public static final String ID = ChangeOutlineViewToLogicalAction.class.getName();

    public ChangeOutlineViewToLogicalAction(final TreeViewer treeViewer) {
        super(ID, null, IAction.AS_RADIO_BUTTON, treeViewer);
        setText(ResourceString.getResourceString("action.title.change.mode.to.logical"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final Event event) {
        final ERDiagram diagram = getDiagram();

        final ChangeOutlineViewModeCommand command = new ChangeOutlineViewModeCommand(diagram, Settings.VIEW_MODE_LOGICAL);

        this.execute(command);
    }

}