<?php

class Account {
    private $username;
    private $password;

    public function __construct($username, $password) {
        $this->username = $username;
        $this->password = $password;
    }
}

/* 
 * Serialize object
 */
$acct = new Account('Austin', '654321');
$serial_acct = serialize($acct) . "\n";
echo $serial_acct . "\n";

/*
 * Deserialize
 */
var_dump(unserialize($serial_acct));

