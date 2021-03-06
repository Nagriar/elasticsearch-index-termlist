package org.xbib.elasticsearch.plugin.termlist;

import org.elasticsearch.action.ActionModule;
import org.xbib.elasticsearch.action.termlist.TermlistAction;
import org.xbib.elasticsearch.action.termlist.TransportTermlistAction;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.rest.RestModule;
import org.xbib.elasticsearch.rest.action.termlist.RestTermlistAction;

public class IndexTermlistPlugin extends AbstractPlugin {

    public String name() {
        return "index-termlist";
    }

    public String description() {
        return "Index termlists for Elasticsearch";
    }

    public void onModule(RestModule module) {
        module.addRestAction(RestTermlistAction.class);
    }

    public void onModule(ActionModule module) {
        module.registerAction(TermlistAction.INSTANCE, TransportTermlistAction.class);
    }

}
