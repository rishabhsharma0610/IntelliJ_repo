/*-----------------------------------------------------------------------------
    Name: 02_Tx_Login
    Generated By: cavisson
    Date of generation: 07/05/2021 04:14:34
    Flow details:
    Build details: 4.6.1 (build# 34)
    Modification History:
-----------------------------------------------------------------------------*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ns_string.h"


void 02_Tx_Login()
{
    ns_start_transaction ("02_Tx_Login");
    ns_web_url ("login",
        "URL=http://184.105.48.40/cgi-bin/login?userSession={usersession}&username={username}&password={password}&login.x=60&login.y=1&login=Login&JSFormSubmit=off",
        "METHOD=GET"
    );
    ns_end_transaction ("02_Tx_Login", NS_AUTO_STATUS);
    ns_page_think_time(3.0);


}