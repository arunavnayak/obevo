//// CHANGE name=chng1
CREATE TABLE TABLE_WITH_ERROR (
	C_ID    BIGINT auto_increment NOT NULL,
	STRING_FIELD	VARCHAR(30)	NULL,
	TIMESTAMP_FIELD	TIMESTAMP	NULL,
	AUTO_JOURNAL_INITIAL_MARGIN   	INTEGER NULL, --- NOT NULL DEFAULT 0,
	PRODUCT_ID INT,
    PRIMARY KEY (C_ID)
)
GO

//// CHANGE name=chng3
bad sql should cause exception here
GO

//// CHANGE name=chng4
ALTER TABLE TABLE_WITH_ERROR ADD COLUMN BLAH2 INT NULL
GO