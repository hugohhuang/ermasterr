package org.insightech.er.db.impl.access;

import org.insightech.er.editor.model.dbimport.ImportFromDBManagerEclipseBase;

public class AccessTableImportManager extends ImportFromDBManagerEclipseBase {

    @Override
    protected String getViewDefinitionSQL(final String schema) {
        return null;
    }
}
