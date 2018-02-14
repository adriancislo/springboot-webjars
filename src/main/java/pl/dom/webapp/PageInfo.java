package pl.dom.webapp;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PageInfo
{
    private String title;
}