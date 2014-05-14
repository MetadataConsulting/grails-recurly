package grails.plugin.recurly.notifications

import grails.plugin.recurly.RecurlyAccount
import grails.plugin.recurly.RecurlyTransaction
import grails.plugin.recurly.helpers.WebHookNotification

class RecurlySuccessfulRefundWebHookNotification extends WebHookNotification {

    public RecurlyAccount recurlyAccount
    public RecurlyTransaction recurlyTransaction

}
