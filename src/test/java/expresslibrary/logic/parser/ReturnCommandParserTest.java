package expresslibrary.logic.parser;

import static expresslibrary.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static expresslibrary.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static expresslibrary.logic.parser.CommandParserTestUtil.assertParseFailure;

import org.junit.jupiter.api.Test;

import expresslibrary.logic.commands.ReturnCommand;

public class ReturnCommandParserTest {

    private ReturnCommandParser parser = new ReturnCommandParser();

    @Test
    public void parse_missingParts_failure() {
        // no index specified
        assertParseFailure(parser, VALID_NAME_AMY, String.format(MESSAGE_INVALID_COMMAND_FORMAT, ReturnCommand.MESSAGE_USAGE));

        // no field specified
        assertParseFailure(parser, "1", String.format(MESSAGE_INVALID_COMMAND_FORMAT, ReturnCommand.MESSAGE_USAGE));

        // no index and no field specified
        assertParseFailure(parser, "", String.format(MESSAGE_INVALID_COMMAND_FORMAT, ReturnCommand.MESSAGE_USAGE));
    }

}
