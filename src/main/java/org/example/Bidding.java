package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bidding {

    //applying method overloding because user can send multiple bids at a time.

    private static Map<String, Integer> biddingData = new HashMap<>();
    static RegisterMember registerMember = new RegisterMember();
    static Map<String, List<String>> registerMap = registerMember.getRegisterMap();

    public static void getBiddingFromAttendees(String eventId, String memberId, Integer firstBid) throws MemberNotFoundException {
        List<String> eventAttendees = registerMap.get(eventId);
        if (!eventAttendees.contains(memberId)) {
            throw new MemberNotFoundException("Member is not registered with this event");
        } else {
            if (biddingData.containsKey(memberId)) {
                if (biddingData.get(memberId) > firstBid) {
                    biddingData.put(memberId, firstBid);
                }
            }
        }


    }

    public static void getBiddingFromAttendees(String eventId, String memberId, Integer firstBid, Integer secondBid) throws MemberNotFoundException {
        List<String> eventAttendees = registerMap.get(eventId);
        if (!eventAttendees.contains(memberId)) {
            throw new MemberNotFoundException("Member is not registered with this event");
        } else {
            if (biddingData.containsKey(memberId)) {
                if (biddingData.get(memberId) > firstBid) {
                    biddingData.put(memberId, firstBid);
                }
            }
            if (biddingData.containsKey(memberId)) {
                if (biddingData.get(memberId) > secondBid) {
                    biddingData.put(memberId, secondBid);
                }
            }

        }
    }

    public static void getBiddingFromAttendees(String eventId, String memberId, Integer firstBid, Integer secondBid, Integer thirdBid) throws MemberNotFoundException {
        List<String> eventAttendees = registerMap.get(eventId);
        if (!eventAttendees.contains(memberId)) {
            throw new MemberNotFoundException("Member is not registered with this event");
        } else {
            if (biddingData.containsKey(memberId)) {
                if (biddingData.get(memberId) > firstBid) {
                    biddingData.put(memberId, firstBid);
                }
            }
            if (biddingData.containsKey(memberId)) {
                if (biddingData.get(memberId) > secondBid) {
                    biddingData.put(memberId, secondBid);
                }
            }
            if (biddingData.containsKey(memberId)) {
                if (biddingData.get(memberId) > thirdBid) {
                    biddingData.put(memberId, thirdBid);
                }
            }
        }
    }
}
